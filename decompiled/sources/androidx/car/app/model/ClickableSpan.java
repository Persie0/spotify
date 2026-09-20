package androidx.car.app.model;

import android.annotation.SuppressLint;
import java.util.Objects;
import p204p.p7l0;
import p204p.q7l0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class ClickableSpan extends CarSpan {
    private final p7l0 mOnClickDelegate;

    private ClickableSpan(q7l0 q7l0Var) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(q7l0Var);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static ClickableSpan create(q7l0 q7l0Var) {
        Objects.requireNonNull(q7l0Var);
        return new ClickableSpan(q7l0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        return Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(((ClickableSpan) obj).mOnClickDelegate == null));
    }

    public p7l0 getOnClickDelegate() {
        p7l0 p7l0Var = this.mOnClickDelegate;
        Objects.requireNonNull(p7l0Var);
        return p7l0Var;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public String toString() {
        return "[clickable]";
    }

    private ClickableSpan() {
        this.mOnClickDelegate = null;
    }
}
