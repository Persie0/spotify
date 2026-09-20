package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n4m implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f150383a;

    /* JADX INFO: renamed from: b */
    public final sjf1 f150384b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f150385c;

    public n4m(String str, sjf1 sjf1Var, ArrayList arrayList) {
        this.f150383a = str;
        this.f150384b = sjf1Var;
        this.f150385c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4m)) {
            return false;
        }
        n4m n4mVar = (n4m) obj;
        return wj50.m88271j(this.f150383a, n4mVar.f150383a) && this.f150384b.equals(n4mVar.f150384b) && this.f150385c.equals(n4mVar.f150385c);
    }

    public final int hashCode() {
        return this.f150385c.hashCode() + ((this.f150384b.hashCode() + (this.f150383a.hashCode() * 31)) * 31);
    }
}
