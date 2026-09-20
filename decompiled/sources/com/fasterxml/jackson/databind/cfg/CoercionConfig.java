package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CoercionConfig implements Serializable {
    private static final int INPUT_SHAPE_COUNT = CoercionInputShape.values().length;
    protected final CoercionAction[] _coercionsByShape = new CoercionAction[INPUT_SHAPE_COUNT];
    protected Boolean _acceptBlankAsEmpty = null;
}
