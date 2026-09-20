package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class rpc {

    /* JADX INFO: renamed from: a */
    public final String f201516a;

    /* JADX INFO: renamed from: b */
    public final String f201517b;

    /* JADX INFO: renamed from: c */
    public final String f201518c;

    /* JADX INFO: renamed from: d */
    public final List f201519d;

    /* JADX INFO: renamed from: e */
    public final boolean f201520e;

    public rpc(String str, String str2, boolean z, String str3, List list) {
        this.f201516a = str;
        this.f201517b = str2;
        this.f201518c = str3;
        this.f201519d = list;
        this.f201520e = z;
    }

    /* JADX INFO: renamed from: a */
    public static rpc m76104a(rpc rpcVar, ArrayList arrayList, boolean z, int i) {
        String str = rpcVar.f201516a;
        String str2 = rpcVar.f201517b;
        String str3 = rpcVar.f201518c;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = rpcVar.f201519d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = rpcVar.f201520e;
        }
        rpcVar.getClass();
        return new rpc(str, str2, z, str3, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpc)) {
            return false;
        }
        rpc rpcVar = (rpc) obj;
        return wj50.m88271j(this.f201516a, rpcVar.f201516a) && wj50.m88271j(this.f201517b, rpcVar.f201517b) && wj50.m88271j(this.f201518c, rpcVar.f201518c) && wj50.m88271j(this.f201519d, rpcVar.f201519d) && this.f201520e == rpcVar.f201520e;
    }

    public final int hashCode() {
        String str = this.f201516a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f201517b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f201518c;
        return Boolean.hashCode(this.f201520e) + s571.m77244c((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f201519d);
    }
}
