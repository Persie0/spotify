package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class gai extends nai {

    /* JADX INFO: renamed from: a */
    public final ArrayList f78055a;

    /* JADX INFO: renamed from: b */
    public final y7i f78056b;

    /* JADX INFO: renamed from: c */
    public final String f78057c;

    public gai(ArrayList arrayList, y7i y7iVar, String str) {
        this.f78055a = arrayList;
        this.f78056b = y7iVar;
        this.f78057c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gai)) {
            return false;
        }
        gai gaiVar = (gai) obj;
        return this.f78055a.equals(gaiVar.f78055a) && this.f78056b.equals(gaiVar.f78056b) && this.f78057c.equals(gaiVar.f78057c);
    }

    public final int hashCode() {
        return this.f78057c.hashCode() + ((this.f78056b.hashCode() + (this.f78055a.hashCode() * 31)) * 31);
    }
}
