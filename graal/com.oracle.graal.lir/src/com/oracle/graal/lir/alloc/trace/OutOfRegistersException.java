/*
 * Copyright (c) 2015, 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.graal.lir.alloc.trace;

import jdk.internal.jvmci.code.*;

public class OutOfRegistersException extends BailoutException {

    private static final long serialVersionUID = -3479786650143432195L;

    private final String description;

    public OutOfRegistersException(String msg) {
        super(msg);
        this.description = "";
    }

    public OutOfRegistersException(Throwable cause, String msg) {
        super(cause, msg);
        this.description = "";
    }

    public OutOfRegistersException(boolean permanent, String msg) {
        super(permanent, msg);
        this.description = "";
    }

    public OutOfRegistersException(String msg, String description) {
        super(msg);
        this.description = description;
    }

    public OutOfRegistersException(Throwable cause, String msg, String description) {
        super(cause, msg);
        this.description = description;
    }

    public OutOfRegistersException(boolean permanent, String msg, String description) {
        super(permanent, msg);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
