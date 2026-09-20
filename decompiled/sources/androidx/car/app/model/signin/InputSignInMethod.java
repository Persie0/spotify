package androidx.car.app.model.signin;

import androidx.car.app.model.CarText;
import java.util.Objects;
import p204p.h021;
import p204p.klh;
import p204p.lw40;
import p204p.rzb;
import p204p.yu40;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class InputSignInMethod implements h021 {
    public static final int INPUT_TYPE_DEFAULT = 1;
    public static final int INPUT_TYPE_PASSWORD = 2;
    public static final int KEYBOARD_DEFAULT = 1;
    public static final int KEYBOARD_EMAIL = 2;
    public static final int KEYBOARD_NUMBER = 4;
    public static final int KEYBOARD_PHONE = 3;
    private final CarText mDefaultValue;
    private final CarText mErrorMessage;
    private final CarText mHint;
    private final yu40 mInputCallbackDelegate;
    private final int mInputType;
    private final int mKeyboardType;
    private final boolean mShowKeyboardByDefault;

    public InputSignInMethod(lw40 lw40Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputSignInMethod)) {
            return false;
        }
        InputSignInMethod inputSignInMethod = (InputSignInMethod) obj;
        return this.mInputType == inputSignInMethod.mInputType && this.mKeyboardType == inputSignInMethod.mKeyboardType && this.mShowKeyboardByDefault == inputSignInMethod.mShowKeyboardByDefault && Objects.equals(this.mHint, inputSignInMethod.mHint) && Objects.equals(this.mDefaultValue, inputSignInMethod.mDefaultValue) && Objects.equals(this.mErrorMessage, inputSignInMethod.mErrorMessage);
    }

    public CarText getDefaultValue() {
        return this.mDefaultValue;
    }

    public CarText getErrorMessage() {
        return this.mErrorMessage;
    }

    public CarText getHint() {
        return this.mHint;
    }

    public yu40 getInputCallbackDelegate() {
        yu40 yu40Var = this.mInputCallbackDelegate;
        Objects.requireNonNull(yu40Var);
        return yu40Var;
    }

    public int getInputType() {
        return this.mInputType;
    }

    public int getKeyboardType() {
        return this.mKeyboardType;
    }

    public int hashCode() {
        return Objects.hash(this.mHint, this.mDefaultValue, Integer.valueOf(this.mInputType), this.mErrorMessage, Integer.valueOf(this.mKeyboardType), Boolean.valueOf(this.mShowKeyboardByDefault));
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[inputType:");
        sb.append(this.mInputType);
        sb.append(", keyboardType: ");
        return klh.m56832d(this.mKeyboardType, "]", sb);
    }

    private InputSignInMethod() {
        this.mHint = null;
        this.mDefaultValue = null;
        this.mInputType = 1;
        this.mErrorMessage = null;
        this.mKeyboardType = 1;
        this.mInputCallbackDelegate = null;
        this.mShowKeyboardByDefault = false;
    }
}
