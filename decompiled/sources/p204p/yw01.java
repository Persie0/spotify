package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class yw01 implements ax01 {

    /* JADX INFO: renamed from: a */
    public final String f276818a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f276819b;

    /* JADX INFO: renamed from: c */
    public final String f276820c;

    public yw01(String str, String str2, ArrayList arrayList) {
        this.f276818a = str;
        this.f276819b = arrayList;
        this.f276820c = str2;
    }

    @Override // p204p.ax01
    /* JADX INFO: renamed from: a */
    public final String mo27354a() {
        return this.f276820c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw01)) {
            return false;
        }
        yw01 yw01Var = (yw01) obj;
        return this.f276818a.equals(yw01Var.f276818a) && this.f276819b.equals(yw01Var.f276819b) && wj50.m88271j(this.f276820c, yw01Var.f276820c);
    }

    public final int hashCode() {
        return this.f276820c.hashCode() + lq51.m59700f(this.f276819b, this.f276818a.hashCode() * 31, 31);
    }
}
