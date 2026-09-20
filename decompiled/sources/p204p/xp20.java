package p204p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xp20 extends a7u0 {

    /* JADX INFO: renamed from: d */
    public static final String f264411d;

    /* JADX INFO: renamed from: e */
    public static final String f264412e;

    /* JADX INFO: renamed from: b */
    public final boolean f264413b;

    /* JADX INFO: renamed from: c */
    public final boolean f264414c;

    static {
        String str = h0b1.f86200a;
        f264411d = Integer.toString(1, 36);
        f264412e = Integer.toString(2, 36);
    }

    public xp20() {
        this.f264413b = false;
        this.f264414c = false;
    }

    @Override // p204p.a7u0
    /* JADX INFO: renamed from: b */
    public final boolean mo24999b() {
        return this.f264413b;
    }

    @Override // p204p.a7u0
    /* JADX INFO: renamed from: c */
    public final Bundle mo25000c() {
        Bundle bundle = new Bundle();
        bundle.putInt(a7u0.f13140a, 0);
        bundle.putBoolean(f264411d, this.f264413b);
        bundle.putBoolean(f264412e, this.f264414c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xp20)) {
            return false;
        }
        xp20 xp20Var = (xp20) obj;
        return this.f264414c == xp20Var.f264414c && this.f264413b == xp20Var.f264413b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f264413b), Boolean.valueOf(this.f264414c));
    }

    public xp20(boolean z) {
        this.f264413b = true;
        this.f264414c = z;
    }
}
