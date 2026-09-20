package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class thp0 implements bip0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f220468a;

    /* JADX INFO: renamed from: b */
    public final String f220469b;

    /* JADX INFO: renamed from: c */
    public final boolean f220470c;

    public thp0(String str, ArrayList arrayList, boolean z) {
        this.f220468a = arrayList;
        this.f220469b = str;
        this.f220470c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thp0)) {
            return false;
        }
        thp0 thp0Var = (thp0) obj;
        return this.f220468a.equals(thp0Var.f220468a) && wj50.m88271j(this.f220469b, thp0Var.f220469b) && this.f220470c == thp0Var.f220470c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220470c) + s571.m77243b(this.f220468a.hashCode() * 31, 31, this.f220469b);
    }
}
