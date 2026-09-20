package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ewy0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f63627a;

    /* JADX INFO: renamed from: b */
    public final wfz f63628b;

    /* JADX INFO: renamed from: c */
    public final String f63629c;

    public ewy0(ArrayList arrayList, wfz wfzVar, String str) {
        this.f63627a = arrayList;
        this.f63628b = wfzVar;
        this.f63629c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewy0)) {
            return false;
        }
        ewy0 ewy0Var = (ewy0) obj;
        return this.f63627a.equals(ewy0Var.f63627a) && wj50.m88271j(this.f63628b, ewy0Var.f63628b) && wj50.m88271j(this.f63629c, ewy0Var.f63629c);
    }

    public final int hashCode() {
        return this.f63629c.hashCode() + ((this.f63628b.hashCode() + (this.f63627a.hashCode() * 31)) * 31);
    }
}
