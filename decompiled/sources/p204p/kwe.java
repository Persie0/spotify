package p204p;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class kwe {

    /* JADX INFO: renamed from: b */
    public static final kwe f127083b = new kwe(new HashMap());

    /* JADX INFO: renamed from: a */
    public final Map f127084a;

    public kwe(HashMap map) {
        this.f127084a = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: a */
    public static jwe m57528a(MediaFormat mediaFormat, Set set) {
        jwe jweVar = new jwe();
        jweVar.f116631a = new HashMap();
        HashMap map = jweVar.f116631a;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                if (valueTypeForKey == 1) {
                    map.put(str, Integer.valueOf(mediaFormat.getInteger(str)));
                } else if (valueTypeForKey == 2) {
                    map.put(str, Long.valueOf(mediaFormat.getLong(str)));
                } else if (valueTypeForKey == 3) {
                    map.put(str, Float.valueOf(mediaFormat.getFloat(str)));
                } else if (valueTypeForKey == 4) {
                    map.put(str, mediaFormat.getString(str));
                } else if (valueTypeForKey == 5) {
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                    if (byteBuffer == null) {
                        map.put(str, null);
                    } else {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                        byteBufferAllocate.put(byteBuffer.duplicate());
                        byteBufferAllocate.flip();
                        map.put(str, byteBufferAllocate);
                    }
                }
            }
        }
        return jweVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kwe) {
            return this.f127084a.equals(((kwe) obj).f127084a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f127084a.hashCode();
    }
}
