package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class pit extends smt {

    /* JADX INFO: renamed from: a */
    public final int f178047a;

    /* JADX INFO: renamed from: b */
    public final String f178048b;

    /* JADX INFO: renamed from: c */
    public final String f178049c;

    /* JADX INFO: renamed from: d */
    public final List f178050d;

    public pit(int i, String str, String str2, List list) {
        this.f178047a = i;
        this.f178048b = str;
        this.f178049c = str2;
        this.f178050d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pit)) {
            return false;
        }
        pit pitVar = (pit) obj;
        return this.f178047a == pitVar.f178047a && wj50.m88271j(this.f178048b, pitVar.f178048b) && wj50.m88271j(this.f178049c, pitVar.f178049c) && wj50.m88271j(this.f178050d, pitVar.f178050d);
    }

    public final int hashCode() {
        return this.f178050d.hashCode() + s571.m77243b(s571.m77243b(Integer.hashCode(this.f178047a) * 31, 31, this.f178048b), 31, this.f178049c);
    }
}
