package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class dr30 extends er30 {

    /* JADX INFO: renamed from: a */
    public final Bundle f52161a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HubsImmutableComponentBundle f52162b;

    public dr30(HubsImmutableComponentBundle hubsImmutableComponentBundle, Bundle bundle) {
        this.f52162b = hubsImmutableComponentBundle;
        this.f52161a = bundle;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: b */
    public final vj30 mo33701b(String str, boolean z) {
        if (wj50.m88271j(this.f52162b.m11896g(Boolean.class, str), Boolean.valueOf(z))) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putBoolean(str, z);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: c */
    public final vj30 mo33702c(String str, boolean[] zArr) {
        if (Arrays.equals((boolean[]) this.f52162b.m11896g(boolean[].class, str), zArr)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putBooleanArray(str, zArr);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: d */
    public final HubsImmutableComponentBundle mo33703d() {
        return this.f52162b;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: e */
    public final vj30 mo33704e(String str, wj30 wj30Var) {
        if (wj50.m88271j(this.f52162b.m11896g(wj30.class, str), wj30Var)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.mo33704e(str, wj30Var);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: f */
    public final vj30 mo33705f(String str, wj30[] wj30VarArr) {
        if (Arrays.equals((Object[]) this.f52162b.m11896g(wj30[].class, str), wj30VarArr)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.mo33705f(str, wj30VarArr);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: g */
    public final vj30 mo33706g(String str, byte[] bArr) {
        if (Arrays.equals((byte[]) this.f52162b.m11896g(byte[].class, str), bArr)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putByteArray(str, bArr);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: h */
    public final vj30 mo33707h(String str, double[] dArr) {
        if (Arrays.equals((double[]) this.f52162b.m11896g(double[].class, str), dArr)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putDoubleArray(str, dArr);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: i */
    public final vj30 mo33708i(String str, double d) {
        if (wj50.m88267h((Double) this.f52162b.m11896g(Double.class, str), d)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putDouble(str, d);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: j */
    public final vj30 mo33709j(String str, float[] fArr) {
        if (Arrays.equals((float[]) this.f52162b.m11896g(float[].class, str), fArr)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putFloatArray(str, fArr);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: k */
    public final vj30 mo33710k(String str, float f) {
        if (wj50.m88269i((Float) this.f52162b.m11896g(Float.class, str), f)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putFloat(str, f);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: l */
    public final vj30 mo33711l(int i, String str) {
        Integer num = (Integer) this.f52162b.m11896g(Integer.class, str);
        if (num != null && num.intValue() == i) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putInt(str, i);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: m */
    public final vj30 mo33712m(String str, int[] iArr) {
        if (Arrays.equals((int[]) this.f52162b.m11896g(int[].class, str), iArr)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putIntArray(str, iArr);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: n */
    public final vj30 mo33713n(String str, long[] jArr) {
        if (Arrays.equals((long[]) this.f52162b.m11896g(long[].class, str), jArr)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putLongArray(str, jArr);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: o */
    public final vj30 mo33714o(long j, String str) {
        Long l = (Long) this.f52162b.m11896g(Long.class, str);
        if (l != null && l.longValue() == j) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putLong(str, j);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: p */
    public final vj30 mo33715p(String str, Parcelable parcelable) {
        if (wj50.m88271j(this.f52162b.m11896g(Parcelable.class, str), parcelable)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putParcelable(str, parcelable);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: q */
    public final vj30 mo33716q(String str, Serializable serializable) {
        if (wj50.m88271j(this.f52162b.m11896g(Serializable.class, str), serializable)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putSerializable(str, serializable);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: r */
    public final vj30 mo33717r(String str, String str2) {
        if (wj50.m88271j(this.f52162b.m11896g(String.class, str), str2)) {
            return this;
        }
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putString(str, str2);
        return cr30Var;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: s */
    public final cr30 mo33718s(String str, String[] strArr) {
        cr30 cr30Var = new cr30(this);
        cr30Var.f41175a.putStringArray(str, strArr);
        return cr30Var;
    }

    @Override // p204p.er30
    /* JADX INFO: renamed from: t */
    public final boolean mo33719t() {
        return this.f52162b.keySet().isEmpty();
    }

    /* JADX INFO: renamed from: u */
    public final Bundle m36703u() {
        return this.f52161a;
    }
}
