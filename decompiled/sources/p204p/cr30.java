package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class cr30 extends er30 {

    /* JADX INFO: renamed from: a */
    public final Bundle f41175a;

    public cr30(dr30 dr30Var) {
        this.f41175a = new Bundle(dr30Var.f52161a);
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: b */
    public final vj30 mo33701b(String str, boolean z) {
        this.f41175a.putBoolean(str, z);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: c */
    public final vj30 mo33702c(String str, boolean[] zArr) {
        this.f41175a.putBooleanArray(str, zArr);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: d */
    public final HubsImmutableComponentBundle mo33703d() {
        br30 br30Var = HubsImmutableComponentBundle.Companion;
        Bundle bundle = new Bundle(this.f41175a);
        br30Var.getClass();
        return new HubsImmutableComponentBundle(bundle);
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: e */
    public final vj30 mo33704e(String str, wj30 wj30Var) {
        HubsImmutableComponentBundle.Companion.getClass();
        this.f41175a.putParcelable(str, br30.m30289e(wj30Var));
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: f */
    public final vj30 mo33705f(String str, wj30[] wj30VarArr) {
        HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr;
        if (wj30VarArr != null && (wj30VarArr instanceof HubsImmutableComponentBundle[])) {
            ArrayList arrayList = new ArrayList(wj30VarArr.length);
            for (wj30 wj30Var : wj30VarArr) {
                arrayList.add((HubsImmutableComponentBundle) wj30Var);
            }
            hubsImmutableComponentBundleArr = (HubsImmutableComponentBundle[]) arrayList.toArray(new HubsImmutableComponentBundle[0]);
        } else if (wj30VarArr != null) {
            ArrayList arrayList2 = new ArrayList(wj30VarArr.length);
            for (wj30 wj30Var2 : wj30VarArr) {
                HubsImmutableComponentBundle.Companion.getClass();
                arrayList2.add(br30.m30289e(wj30Var2));
            }
            hubsImmutableComponentBundleArr = (HubsImmutableComponentBundle[]) arrayList2.toArray(new HubsImmutableComponentBundle[0]);
        } else {
            hubsImmutableComponentBundleArr = null;
        }
        this.f41175a.putParcelableArray(str, hubsImmutableComponentBundleArr);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: g */
    public final vj30 mo33706g(String str, byte[] bArr) {
        this.f41175a.putByteArray(str, bArr);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: h */
    public final vj30 mo33707h(String str, double[] dArr) {
        this.f41175a.putDoubleArray(str, dArr);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: i */
    public final vj30 mo33708i(String str, double d) {
        this.f41175a.putDouble(str, d);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: j */
    public final vj30 mo33709j(String str, float[] fArr) {
        this.f41175a.putFloatArray(str, fArr);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: k */
    public final vj30 mo33710k(String str, float f) {
        this.f41175a.putFloat(str, f);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: l */
    public final vj30 mo33711l(int i, String str) {
        this.f41175a.putInt(str, i);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: m */
    public final vj30 mo33712m(String str, int[] iArr) {
        this.f41175a.putIntArray(str, iArr);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: n */
    public final vj30 mo33713n(String str, long[] jArr) {
        this.f41175a.putLongArray(str, jArr);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: o */
    public final vj30 mo33714o(long j, String str) {
        this.f41175a.putLong(str, j);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: p */
    public final vj30 mo33715p(String str, Parcelable parcelable) {
        this.f41175a.putParcelable(str, parcelable);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: q */
    public final vj30 mo33716q(String str, Serializable serializable) {
        this.f41175a.putSerializable(str, serializable);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: r */
    public final vj30 mo33717r(String str, String str2) {
        this.f41175a.putString(str, str2);
        return this;
    }

    @Override // p204p.vj30
    /* JADX INFO: renamed from: s */
    public final cr30 mo33718s(String str, String[] strArr) {
        this.f41175a.putStringArray(str, strArr);
        return this;
    }

    @Override // p204p.er30
    /* JADX INFO: renamed from: t */
    public final boolean mo33719t() {
        return this.f41175a.isEmpty();
    }
}
