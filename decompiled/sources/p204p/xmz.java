package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class xmz {

    /* JADX INFO: renamed from: a */
    public final jcm f263470a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f263471b;

    public xmz(jcm jcmVar, ArrayList arrayList) {
        this.f263470a = jcmVar;
        this.f263471b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmz)) {
            return false;
        }
        xmz xmzVar = (xmz) obj;
        return wj50.m88271j(this.f263470a, xmzVar.f263470a) && this.f263471b.equals(xmzVar.f263471b);
    }

    public final int hashCode() {
        return this.f263471b.hashCode() + (this.f263470a.hashCode() * 31);
    }
}
