package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class yjk {

    /* JADX INFO: renamed from: a */
    public final String f273383a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f273384b;

    /* JADX INFO: renamed from: c */
    public final String f273385c;

    /* JADX INFO: renamed from: d */
    public final List f273386d;

    public yjk(String str, ArrayList arrayList, String str2, List list) {
        this.f273383a = str;
        this.f273384b = arrayList;
        this.f273385c = str2;
        this.f273386d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjk)) {
            return false;
        }
        yjk yjkVar = (yjk) obj;
        return wj50.m88271j(this.f273383a, yjkVar.f273383a) && this.f273384b.equals(yjkVar.f273384b) && wj50.m88271j(this.f273385c, yjkVar.f273385c) && wj50.m88271j(this.f273386d, yjkVar.f273386d);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f273384b, this.f273383a.hashCode() * 31, 31);
        String str = this.f273385c;
        return this.f273386d.hashCode() + ((iM59700f + (str == null ? 0 : str.hashCode())) * 31);
    }
}
