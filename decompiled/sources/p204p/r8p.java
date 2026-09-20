package p204p;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r8p implements kmj {

    /* JADX INFO: renamed from: c */
    public static final r8p f196823c = new r8p(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: a */
    public int f196824a;

    /* JADX INFO: renamed from: b */
    public final Map f196825b;

    public r8p(Map map) {
        this.f196825b = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m74992c(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final r8p m74993b(n6i n6iVar) {
        byte[] bytes;
        Map map = this.f196825b;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList((ArrayList) n6iVar.f150892c));
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            map2.remove(listUnmodifiableList.get(i));
        }
        HashMap map3 = new HashMap((HashMap) n6iVar.f150891b);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(map3).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bytes = ((String) value2).getBytes(StandardCharsets.UTF_8);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value2;
            }
            map2.put(str, bytes);
        }
        return m74992c(map, map2) ? this : new r8p(map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8p.class != obj.getClass()) {
            return false;
        }
        return m74992c(this.f196825b, ((r8p) obj).f196825b);
    }

    public final int hashCode() {
        if (this.f196824a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f196825b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f196824a = iHashCode;
        }
        return this.f196824a;
    }
}
