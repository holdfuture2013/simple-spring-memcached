/*
 * Copyright (c) 2012-2013 Jakub Białek
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.google.code.ssm.spring.test.entity;

import java.io.Serializable;

import com.google.code.ssm.api.CacheKeyMethod;

/**
 * 
 * @author Jakub Białek
 * @since 3.0.0
 * 
 */
public class AppUserPK implements Serializable {

    private static final long serialVersionUID = -2833660418204559330L;

    private int userId;

    private int applicationId;

    public AppUserPK() {

    }

    public AppUserPK(final int userId, final int applicationId) {
        this.userId = userId;
        this.applicationId = applicationId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(final int userId) {
        this.userId = userId;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(final int applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + applicationId;
        result = prime * result + userId;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AppUserPK other = (AppUserPK) obj;
        if (applicationId != other.applicationId)
            return false;
        if (userId != other.userId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "AppUserPK [applicationId=" + applicationId + ", userId=" + userId + "]";
    }

    @CacheKeyMethod
    public String cacheKey() {
        return userId + "/" + applicationId;
    }

}
