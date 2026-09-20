package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ex61 {

    /* JADX INFO: renamed from: a */
    public final String f63681a;

    /* JADX INFO: renamed from: b */
    public final List f63682b;

    /* JADX INFO: renamed from: c */
    public final String f63683c;

    public ex61(String str, String str2, ae50 ae50Var) {
        this.f63681a = str;
        this.f63682b = ae50Var;
        this.f63683c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex61)) {
            return false;
        }
        ex61 ex61Var = (ex61) obj;
        return wj50.m88271j(this.f63681a, ex61Var.f63681a) && wj50.m88271j(this.f63682b, ex61Var.f63682b) && wj50.m88271j(this.f63683c, ex61Var.f63683c);
    }

    public final int hashCode() {
        return this.f63683c.hashCode() + s571.m77244c(this.f63681a.hashCode() * 31, 31, this.f63682b);
    }
}
