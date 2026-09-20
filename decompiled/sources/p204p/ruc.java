package p204p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class ruc {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f202797a;

    public ruc(int i) {
        switch (i) {
            case 1:
                this.f202797a = new ConcurrentHashMap();
                break;
            default:
                this.f202797a = new ConcurrentHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76432a(String str, quc qucVar, byte[] bArr) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.f202797a;
        Object linkedHashMap = concurrentHashMap.get(str);
        if (linkedHashMap == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (linkedHashMap = new LinkedHashMap()))) != null) {
            linkedHashMap = objPutIfAbsent;
        }
        Map map = (Map) linkedHashMap;
        Object arrayList = map.get(qucVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(qucVar, arrayList);
        }
        ((List) arrayList).add(bArr);
    }

    /* JADX INFO: renamed from: b */
    public boolean m76433b(String str, quc qucVar, int i, byte[] bArr) {
        Object objPutIfAbsent;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        ConcurrentHashMap concurrentHashMap = this.f202797a;
        if (i == 0) {
            Object linkedHashMap = concurrentHashMap.get(str);
            if (linkedHashMap == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (linkedHashMap = new LinkedHashMap()))) != null) {
                linkedHashMap = objPutIfAbsent;
            }
            ((Map) linkedHashMap).put(qucVar, h6f.m46717N(bArrCopyOf));
            return true;
        }
        Map map = (Map) concurrentHashMap.get(str);
        List list = map != null ? (List) map.get(qucVar) : null;
        if (i >= 0 && list != null) {
            Iterator it = list.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += ((byte[]) it.next()).length;
            }
            if (length == i) {
                list.add(bArrCopyOf);
                return true;
            }
        }
        m76434c(str, qucVar);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m76434c(String str, quc qucVar) {
        try {
            Map map = (Map) this.f202797a.get(str);
            if (map != null) {
            }
            Map map2 = (Map) this.f202797a.get(str);
            if (map2 != null && map2.isEmpty()) {
                this.f202797a.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
