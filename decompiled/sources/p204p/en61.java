package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class en61 implements mn61 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f61085a;

    /* JADX INFO: renamed from: b */
    public final String f61086b;

    /* JADX INFO: renamed from: c */
    public final String f61087c;

    public en61(String str, String str2, ArrayList arrayList) {
        this.f61085a = arrayList;
        this.f61086b = str;
        this.f61087c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en61)) {
            return false;
        }
        en61 en61Var = (en61) obj;
        return this.f61085a.equals(en61Var.f61085a) && wj50.m88271j(this.f61086b, en61Var.f61086b) && wj50.m88271j(this.f61087c, en61Var.f61087c);
    }

    public final int hashCode() {
        return this.f61087c.hashCode() + s571.m77243b(this.f61085a.hashCode() * 31, 31, this.f61086b);
    }
}
