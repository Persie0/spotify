package androidx.car.app.model;

import java.util.Objects;
import p204p.edb;
import p204p.nx71;
import p204p.o7l0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;
    private final o7l0 mOnCheckedChangeDelegate;

    public Toggle(nx71 nx71Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled;
    }

    public o7l0 getOnCheckedChangeDelegate() {
        o7l0 o7l0Var = this.mOnCheckedChangeDelegate;
        Objects.requireNonNull(o7l0Var);
        return o7l0Var;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsChecked), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ isChecked: ");
        sb.append(this.mIsChecked);
        sb.append(", isEnabled: ");
        return edb.m38570s(sb, this.mIsEnabled, "]");
    }

    private Toggle() {
        this.mOnCheckedChangeDelegate = null;
        this.mIsChecked = false;
        this.mIsEnabled = true;
    }
}
