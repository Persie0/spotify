package p204p;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ly71 {

    /* JADX INFO: renamed from: a */
    public final byte[] f137981a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f137982b;

    public ly71(byte[] bArr, List list) {
        this.f137981a = bArr;
        this.f137982b = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.f137982b.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    /* JADX INFO: renamed from: a */
    public static ly71 m60235a(String str, List list) throws IOException {
        Collections.sort(list, new iw31(1));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return new ly71(byteArrayOutputStream.toByteArray(), list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ly71.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f137981a, ((ly71) obj).f137981a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f137981a);
    }
}
