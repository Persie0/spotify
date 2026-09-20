package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class snw0 {

    /* JADX INFO: renamed from: a */
    public final rvc f211036a;

    /* JADX INFO: renamed from: b */
    public final String f211037b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f211038c;

    public snw0(rvc rvcVar, String str, ArrayList arrayList) {
        this.f211036a = rvcVar;
        this.f211037b = str;
        this.f211038c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snw0)) {
            return false;
        }
        snw0 snw0Var = (snw0) obj;
        return wj50.m88271j(this.f211036a, snw0Var.f211036a) && wj50.m88271j(this.f211037b, snw0Var.f211037b) && this.f211038c.equals(snw0Var.f211038c);
    }

    public final int hashCode() {
        return this.f211038c.hashCode() + s571.m77243b(this.f211036a.hashCode() * 31, 31, this.f211037b);
    }
}
