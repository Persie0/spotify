package p204p;

import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class upx extends dpx {

    /* JADX INFO: renamed from: b */
    public final bqx f232839b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f232840c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f232841d;

    public upx(bqx bqxVar, List list) {
        this.f232839b = bqxVar;
        int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ptx ptxVar = (ptx) it.next();
            linkedHashMap.put(Integer.valueOf(ptxVar.f181267a), ptxVar.f181268b);
        }
        this.f232840c = linkedHashMap;
        this.f232841d = new LinkedHashMap();
    }

    @Override // p204p.dpx
    /* JADX INFO: renamed from: a */
    public final ktx mo30169a(Class cls) {
        LinkedHashMap linkedHashMap = this.f232841d;
        ktx ktxVar = (ktx) linkedHashMap.get(cls);
        if (ktxVar != null) {
            return ktxVar;
        }
        try {
            aqx aqxVarM30280a = this.f232839b.m30280a(cls);
            if (aqxVarM30280a == null) {
                return null;
            }
            byte[] bArr = (byte[]) this.f232840c.get(Integer.valueOf(aqxVarM30280a.mo26904b()));
            ktx ktxVarMo26903a = bArr != null ? aqxVarM30280a.mo26903a(bArr) : null;
            if (ktxVarMo26903a != null) {
                linkedHashMap.put(cls, ktxVarMo26903a);
            }
            return ktxVarMo26903a;
        } catch (InvalidProtocolBufferException e) {
            na6.m63959g("Failed to parse extended metadata of type '" + cls.getName() + "'", e);
            return null;
        }
    }

    @Override // p204p.dpx
    /* JADX INFO: renamed from: b */
    public final Map mo30170b() {
        return this.f232840c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpx)) {
            return false;
        }
        LinkedHashMap linkedHashMap = this.f232840c;
        dpx dpxVar = (dpx) obj;
        if (linkedHashMap.size() != dpxVar.mo30170b().size()) {
            return false;
        }
        if (linkedHashMap.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            byte[] bArr = (byte[]) entry.getValue();
            byte[] bArr2 = (byte[]) dpxVar.mo30170b().get(Integer.valueOf(iIntValue));
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.dpx
    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.f232840c;
        int size = linkedHashMap.size();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            size = (size ^ Integer.hashCode(((Number) entry.getKey()).intValue())) ^ Arrays.hashCode((byte[]) entry.getValue());
        }
        return size;
    }
}
