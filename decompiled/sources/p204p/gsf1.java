package p204p;

import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes4.dex */
public final class gsf1 extends cdo implements zc00 {

    /* JADX INFO: renamed from: d */
    public final int f83961d;

    public gsf1(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f83961d = i2;
    }

    /* JADX INFO: renamed from: b */
    public final pfo m45645b() {
        return new ntf1(this.f36920a, this.f36921b, this.f83961d);
    }

    public final String toString() {
        String str;
        if (m32455a() == 1) {
            str = "changed";
        } else {
            str = m32455a() == 2 ? "deleted" : "unknown";
        }
        return dq60.m36615o("DataEventRef{ type=", str, ", dataitem=", m45645b().toString(), " }");
    }
}
