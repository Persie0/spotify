package p204p;

import androidx.car.app.model.Alert;
import com.spotify.cosmos.cosmos.Request;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import org.java_websocket.exceptions.IncompleteException;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;

/* JADX INFO: loaded from: classes16.dex */
public final class dcs {

    /* JADX INFO: renamed from: a */
    public int f47621a;

    /* JADX INFO: renamed from: b */
    public final xra0 f47622b;

    /* JADX INFO: renamed from: c */
    public bhp f47623c;

    /* JADX INFO: renamed from: d */
    public final bhp f47624d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f47625e;

    /* JADX INFO: renamed from: f */
    public bhp f47626f;

    /* JADX INFO: renamed from: g */
    public tx30 f47627g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f47628h;

    /* JADX INFO: renamed from: i */
    public fmk f47629i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f47630j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f47631k;

    /* JADX INFO: renamed from: l */
    public final SecureRandom f47632l;

    /* JADX INFO: renamed from: m */
    public final int f47633m;

    public dcs(int i, List list, List list2) {
        boolean z = false;
        this.f47621a = 0;
        this.f47622b = bsa0.m30425b(dcs.class);
        this.f47623c = new bhp();
        this.f47624d = new bhp();
        this.f47632l = new SecureRandom();
        if (list == null || list2 == null || i < 1) {
            throw new IllegalArgumentException();
        }
        this.f47625e = new ArrayList(list.size());
        this.f47628h = new ArrayList(list2.size());
        this.f47630j = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((bhp) it.next()).getClass().equals(bhp.class)) {
                z = true;
            }
        }
        this.f47625e.addAll(list);
        if (!z) {
            ArrayList arrayList = this.f47625e;
            arrayList.add(arrayList.size(), this.f47623c);
        }
        this.f47628h.addAll(list2);
        this.f47633m = i;
        this.f47626f = null;
    }

    /* JADX INFO: renamed from: i */
    public static String m35671i(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - byteBufferAllocate.position());
                byteBufferAllocate = null;
                break;
            }
            byte b2 = byteBuffer.get();
            byteBufferAllocate.put(b2);
            if (b == 13 && b2 == 10) {
                byteBufferAllocate.limit(byteBufferAllocate.position() - 2);
                byteBufferAllocate.position(0);
                break;
            }
            b = b2;
        }
        if (byteBufferAllocate == null) {
            return null;
        }
        byte[] bArrArray = byteBufferAllocate.array();
        int iLimit = byteBufferAllocate.limit();
        CodingErrorAction codingErrorAction = uuc.f234148a;
        return new String(bArrArray, 0, iLimit, StandardCharsets.US_ASCII);
    }

    /* JADX INFO: renamed from: a */
    public final int m35672a(ec20 ec20Var, fc20 fc20Var) {
        String strM81892g;
        char c;
        fc20 fc20Var2 = fc20Var;
        boolean zEqualsIgnoreCase = fc20Var2.m47091b("Upgrade").equalsIgnoreCase("websocket");
        xra0 xra0Var = this.f47622b;
        if (!zEqualsIgnoreCase || !fc20Var2.m47091b("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            xra0Var.mo27145p("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return 2;
        }
        if (!((TreeMap) ec20Var.f89665a).containsKey("Sec-WebSocket-Key") || !((TreeMap) fc20Var2.f89665a).containsKey("Sec-WebSocket-Accept")) {
            xra0Var.mo27145p("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return 2;
        }
        String strM47091b = fc20Var2.m47091b("Sec-WebSocket-Accept");
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest((ec20Var.m47091b("Sec-WebSocket-Key").trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes());
            try {
                strM81892g = tx8.m81892g(bArrDigest, bArrDigest.length);
            } catch (IOException unused) {
                strM81892g = null;
            }
            if (!strM81892g.equals(strM47091b)) {
                xra0Var.mo27145p("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
                return 2;
            }
            fc20Var2.m47091b("Sec-WebSocket-Extensions");
            Iterator it = this.f47625e.iterator();
            if (it.hasNext()) {
                bhp bhpVar = (bhp) it.next();
                bhpVar.getClass();
                this.f47623c = bhpVar;
                xra0Var.mo27141l(bhpVar, "acceptHandshakeAsClient - Matching extension found: {}");
                c = 1;
            } else {
                c = 2;
            }
            if (m35676e(fc20Var2.m47091b("Sec-WebSocket-Protocol")) == 1 && c == 1) {
                return 1;
            }
            xra0Var.mo27145p("acceptHandshakeAsClient - No matching extension or protocol found.");
            return 2;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m35673b(ec20 ec20Var) {
        char c;
        ec20 ec20Var2 = ec20Var;
        String strM47091b = ec20Var2.m47091b("Sec-WebSocket-Version");
        int iIntValue = -1;
        if (strM47091b.length() > 0) {
            try {
                iIntValue = new Integer(strM47091b.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        xra0 xra0Var = this.f47622b;
        if (iIntValue != 13) {
            xra0Var.mo27145p("acceptHandshakeAsServer - Wrong websocket version.");
            return 2;
        }
        ec20Var2.m47091b("Sec-WebSocket-Extensions");
        Iterator it = this.f47625e.iterator();
        if (it.hasNext()) {
            bhp bhpVar = (bhp) it.next();
            bhpVar.getClass();
            this.f47623c = bhpVar;
            xra0Var.mo27141l(bhpVar, "acceptHandshakeAsServer - Matching extension found: {}");
            c = 1;
        } else {
            c = 2;
        }
        if (m35676e(ec20Var2.m47091b("Sec-WebSocket-Protocol")) == 1 && c == 1) {
            return 1;
        }
        xra0Var.mo27145p("acceptHandshakeAsServer - No matching extension or protocol found.");
        return 2;
    }

    /* JADX INFO: renamed from: c */
    public final void m35674c(ByteBuffer byteBuffer) {
        synchronized (this.f47630j) {
            this.f47630j.add(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m35675d() throws LimitExceededException {
        long jLimit;
        synchronized (this.f47630j) {
            try {
                Iterator it = this.f47630j.iterator();
                jLimit = 0;
                while (it.hasNext()) {
                    jLimit += (long) ((ByteBuffer) it.next()).limit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jLimit <= this.f47633m) {
            return;
        }
        synchronized (this.f47630j) {
            this.f47630j.clear();
        }
        this.f47622b.mo27138i("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.f47633m), Long.valueOf(jLimit));
        throw new LimitExceededException(this.f47633m);
    }

    /* JADX INFO: renamed from: e */
    public final int m35676e(String str) {
        Iterator it = this.f47628h.iterator();
        if (!it.hasNext()) {
            return 2;
        }
        tx30 tx30Var = (tx30) it.next();
        ((q3t0) tx30Var).getClass();
        this.f47627g = tx30Var;
        this.f47622b.mo27141l(tx30Var, "acceptHandshake - Matching protocol found: {}");
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dcs.class != obj.getClass()) {
            return false;
        }
        dcs dcsVar = (dcs) obj;
        if (this.f47633m != dcsVar.f47633m) {
            return false;
        }
        bhp bhpVar = this.f47623c;
        if (bhpVar != null) {
            if (!bhpVar.equals(dcsVar.f47623c)) {
                return false;
            }
        } else if (dcsVar.f47623c != null) {
            return false;
        }
        tx30 tx30Var = this.f47627g;
        if (tx30Var != null) {
            return tx30Var.equals(dcsVar.f47627g);
        }
        return dcsVar.f47627g == null;
    }

    /* JADX INFO: renamed from: f */
    public final ByteBuffer m35677f() {
        ByteBuffer byteBufferAllocate;
        synchronized (this.f47630j) {
            try {
                Iterator it = this.f47630j.iterator();
                long jLimit = 0;
                while (it.hasNext()) {
                    jLimit += (long) ((ByteBuffer) it.next()).limit();
                }
                m35675d();
                byteBufferAllocate = ByteBuffer.allocate((int) jLimit);
                Iterator it2 = this.f47630j.iterator();
                while (it2.hasNext()) {
                    byteBufferAllocate.put((ByteBuffer) it2.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: g */
    public final void m35678g(sld1 sld1Var, RuntimeException runtimeException) {
        this.f47622b.mo27136g(runtimeException, "Runtime exception during onWebsocketMessage");
        sld1Var.f210399c.m91427g(runtimeException);
    }

    /* JADX INFO: renamed from: h */
    public final void m35679h(sld1 sld1Var, fmk fmkVar) throws InvalidDataException {
        int i;
        String str;
        int i2 = fmkVar.f71064b;
        if (i2 == 6) {
            if (fmkVar instanceof tse) {
                tse tseVar = (tse) fmkVar;
                i = tseVar.f223289i;
                str = tseVar.f223290j;
            } else {
                i = 1005;
                str = "";
            }
            if (sld1Var.f210401e == 3) {
                sld1Var.m78461d(str, i, true);
                return;
            } else {
                sld1Var.m78458a(str, i, true);
                return;
            }
        }
        if (i2 == 4) {
            xld1 xld1Var = sld1Var.f210399c;
            xld1Var.getClass();
            tx8.m81888c("p.yld1", "onWebsocketPing()");
            b9q0 b9q0Var = new b9q0(5, 0);
            b9q0Var.f71065c = ((i3o0) fmkVar).f71065c;
            sld1Var.m78471n(b9q0Var);
            xld1Var.m91424d();
            return;
        }
        if (i2 == 5) {
            sld1Var.f210396Z = System.nanoTime();
            sld1Var.f210399c.getClass();
            return;
        }
        boolean z = fmkVar.f71063a;
        if (z && i2 != 1) {
            if (this.f47629i != null) {
                this.f47622b.mo27134e("Protocol error: Continuous frame sequence not completed.");
                throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
            }
            if (i2 == 2) {
                try {
                    sld1Var.f210399c.m91429i(uuc.m83977b(fmkVar.mo42159a()));
                    return;
                } catch (RuntimeException e) {
                    m35678g(sld1Var, e);
                    return;
                }
            }
            if (i2 != 3) {
                this.f47622b.mo27134e("non control or continious frame expected");
                throw new InvalidDataException(1002, "non control or continious frame expected");
            }
            try {
                sld1Var.f210399c.m91430j(fmkVar.mo42159a());
                return;
            } catch (RuntimeException e2) {
                m35678g(sld1Var, e2);
                return;
            }
        }
        xra0 xra0Var = this.f47622b;
        if (i2 != 1) {
            if (this.f47629i != null) {
                xra0Var.mo27145p("Protocol error: Previous continuous frame sequence not completed.");
                throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
            }
            this.f47629i = fmkVar;
            m35674c(fmkVar.mo42159a());
            m35675d();
        } else if (z) {
            if (this.f47629i == null) {
                xra0Var.mo27145p("Protocol error: Previous continuous frame sequence not completed.");
                throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
            }
            m35674c(fmkVar.mo42159a());
            m35675d();
            fmk fmkVar2 = this.f47629i;
            int i3 = fmkVar2.f71064b;
            if (i3 == 2) {
                fmkVar2.mo42160d(m35677f());
                this.f47629i.mo41513b();
                try {
                    sld1Var.f210399c.m91429i(uuc.m83977b(this.f47629i.mo42159a()));
                } catch (RuntimeException e3) {
                    m35678g(sld1Var, e3);
                }
            } else if (i3 == 3) {
                fmkVar2.mo42160d(m35677f());
                this.f47629i.mo41513b();
                try {
                    sld1Var.f210399c.m91430j(this.f47629i.mo42159a());
                } catch (RuntimeException e4) {
                    m35678g(sld1Var, e4);
                }
            }
            this.f47629i = null;
            synchronized (this.f47630j) {
                this.f47630j.clear();
            }
        } else if (this.f47629i == null) {
            xra0Var.mo27134e("Protocol error: Continuous frame sequence was not started.");
            throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
        }
        if (i2 == 2 && !uuc.m83976a(fmkVar.mo42159a())) {
            xra0Var.mo27134e("Protocol error: Payload is not UTF8");
            throw new InvalidDataException(1007);
        }
        if (i2 != 1 || this.f47629i == null) {
            return;
        }
        m35674c(fmkVar.mo42159a());
    }

    public final int hashCode() {
        int iHashCode = this.f47623c != null ? bhp.class.hashCode() : 0;
        int i = this.f47633m;
        return (iHashCode * 961) + (i ^ (i >>> 32));
    }

    /* JADX INFO: renamed from: j */
    public final String m35680j() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: k */
    public final List m35681k(ByteBuffer byteBuffer) throws InvalidDataException {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.f47631k == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int iRemaining = byteBuffer.remaining();
                int iRemaining2 = this.f47631k.remaining();
                if (iRemaining2 <= iRemaining) {
                    this.f47631k.put(byteBuffer.array(), byteBuffer.position(), iRemaining2);
                    byteBuffer.position(byteBuffer.position() + iRemaining2);
                    linkedList.add(m35683m((ByteBuffer) this.f47631k.duplicate().position(0)));
                    this.f47631k = null;
                    break;
                }
                this.f47631k.put(byteBuffer.array(), byteBuffer.position(), iRemaining);
                byteBuffer.position(byteBuffer.position() + iRemaining);
                return Collections.EMPTY_LIST;
            } catch (IncompleteException e) {
                int i = e.f10958a;
                if (i < 0) {
                    throw new InvalidDataException(1002, "Negative count");
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                this.f47631k.rewind();
                byteBufferAllocate.put(this.f47631k);
                this.f47631k = byteBufferAllocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(m35683m(byteBuffer));
            } catch (IncompleteException e2) {
                byteBuffer.reset();
                int i2 = e2.f10958a;
                if (i2 < 0) {
                    throw new InvalidDataException(1002, "Negative count");
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
                this.f47631k = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: l */
    public final hc20 m35682l(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        hc20 hc20Var;
        int i = this.f47621a;
        String strM35671i = m35671i(byteBuffer);
        if (strM35671i == null) {
            throw new IncompleteHandshakeException(byteBuffer.capacity() + 128);
        }
        String[] strArrSplit = strM35671i.split(" ", 3);
        if (strArrSplit.length != 3) {
            throw new InvalidHandshakeException();
        }
        if (i == 1) {
            if (!"101".equals(strArrSplit[1])) {
                throw new InvalidHandshakeException("Invalid status code received: " + strArrSplit[1] + " Status line: " + strM35671i);
            }
            if (!"HTTP/1.1".equalsIgnoreCase(strArrSplit[0])) {
                throw new InvalidHandshakeException("Invalid status line received: " + strArrSplit[0] + " Status line: " + strM35671i);
            }
            fc20 fc20Var = new fc20();
            Short.parseShort(strArrSplit[1]);
            fc20Var.f67970b = strArrSplit[2];
            hc20Var = fc20Var;
        } else {
            if (!Request.GET.equalsIgnoreCase(strArrSplit[0])) {
                throw new InvalidHandshakeException("Invalid request method received: " + strArrSplit[0] + " Status line: " + strM35671i);
            }
            if (!"HTTP/1.1".equalsIgnoreCase(strArrSplit[2])) {
                throw new InvalidHandshakeException("Invalid status line received: " + strArrSplit[2] + " Status line: " + strM35671i);
            }
            ec20 ec20Var = new ec20();
            ec20Var.m38467e(strArrSplit[1]);
            hc20Var = ec20Var;
        }
        String strM35671i2 = m35671i(byteBuffer);
        while (strM35671i2 != null && strM35671i2.length() > 0) {
            String[] strArrSplit2 = strM35671i2.split(":", 2);
            if (strArrSplit2.length != 2) {
                throw new InvalidHandshakeException("not an http header");
            }
            if (((TreeMap) hc20Var.f89665a).containsKey(strArrSplit2[0])) {
                hc20Var.m47093d(strArrSplit2[0], hc20Var.m47091b(strArrSplit2[0]) + "; " + strArrSplit2[1].replaceFirst("^ +", ""));
            } else {
                hc20Var.m47093d(strArrSplit2[0], strArrSplit2[1].replaceFirst("^ +", ""));
            }
            strM35671i2 = m35671i(byteBuffer);
        }
        if (strM35671i2 != null) {
            return hc20Var;
        }
        throw new IncompleteHandshakeException();
    }

    /* JADX INFO: renamed from: m */
    public final fmk m35683m(ByteBuffer byteBuffer) throws IncompleteException, InvalidDataException {
        int i;
        int i2;
        int iIntValue;
        int i3;
        fmk ff9Var;
        int i4;
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int iRemaining = byteBuffer.remaining();
        m35685o(iRemaining, 2);
        byte b = byteBuffer.get();
        boolean z = (b >> 8) != 0;
        boolean z2 = (b & 64) != 0;
        boolean z3 = (b & 32) != 0;
        boolean z4 = (b & 16) != 0;
        byte b2 = byteBuffer.get();
        boolean z5 = (b2 & (-128)) != 0;
        byte b3 = (byte) (b2 & 127);
        byte b4 = (byte) (b & 15);
        if (b4 == 0) {
            i = 2;
            i2 = 1;
        } else if (b4 == 1) {
            i2 = 2;
            i = 2;
        } else if (b4 != 2) {
            switch (b4) {
                case 8:
                    i = 2;
                    i2 = 6;
                    break;
                case 9:
                    i = 2;
                    i2 = 4;
                    break;
                case 10:
                    i = 2;
                    i2 = 5;
                    break;
                default:
                    throw new InvalidFrameException("Unknown opcode " + ((int) b4));
            }
        } else {
            i = 2;
            i2 = 3;
        }
        xra0 xra0Var = this.f47622b;
        if (b3 >= 0 && b3 <= 125) {
            iIntValue = b3;
            i3 = i;
        } else {
            if (i2 == 4 || i2 == 5 || i2 == 6) {
                xra0Var.mo27145p("Invalid frame: more than 125 octets");
                throw new InvalidFrameException("more than 125 octets");
            }
            if (b3 == 126) {
                m35685o(iRemaining, 4);
                byte[] bArr = new byte[3];
                bArr[1] = byteBuffer.get();
                bArr[i] = byteBuffer.get();
                iIntValue = new BigInteger(bArr).intValue();
                i3 = 4;
            } else {
                m35685o(iRemaining, 10);
                byte[] bArr2 = new byte[8];
                for (int i5 = 0; i5 < 8; i5++) {
                    bArr2[i5] = byteBuffer.get();
                }
                long jLongValue = new BigInteger(bArr2).longValue();
                m35684n(jLongValue);
                iIntValue = (int) jLongValue;
                i3 = 10;
            }
        }
        m35684n(iIntValue);
        m35685o(iRemaining, i3 + (z5 ? 4 : 0) + iIntValue);
        if (iIntValue < 0) {
            throw new InvalidDataException(1002, "Negative count");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iIntValue);
        if (z5) {
            byte[] bArr3 = new byte[4];
            byteBuffer.get(bArr3);
            for (int i6 = 0; i6 < iIntValue; i6++) {
                byteBufferAllocate.put((byte) (byteBuffer.get() ^ bArr3[i6 % 4]));
            }
        } else {
            byteBufferAllocate.put(byteBuffer.array(), byteBuffer.position(), byteBufferAllocate.limit());
            byteBuffer.position(byteBuffer.position() + byteBufferAllocate.limit());
        }
        int iM38547C = edb.m38547C(i2);
        if (iM38547C != 0) {
            if (iM38547C == 1) {
                ff9Var = new ff9(2, 2);
            } else if (iM38547C == i) {
                ff9Var = new ff9(3, 0);
            } else if (iM38547C == 3) {
                ff9Var = new i3o0(4, 0);
            } else if (iM38547C == 4) {
                ff9Var = new b9q0(5, 0);
            } else {
                if (iM38547C != 5) {
                    throw new IllegalArgumentException("Supplied opcode is invalid");
                }
                ff9Var = new tse();
            }
            i4 = 1;
        } else {
            i4 = 1;
            ff9Var = new ff9(1, 1);
        }
        ff9Var.f71063a = z;
        ff9Var.f71067e = z2;
        ff9Var.f71068f = z3;
        ff9Var.f71069g = z4;
        byteBufferAllocate.flip();
        ff9Var.mo42160d(byteBufferAllocate);
        int i7 = ff9Var.f71064b;
        bhp bhpVar = this.f47624d;
        if (i7 != i4) {
            if (ff9Var.f71067e || ff9Var.f71068f || ff9Var.f71069g) {
                this.f47626f = this.f47623c;
            } else {
                this.f47626f = bhpVar;
            }
        }
        if (this.f47626f == null) {
            this.f47626f = bhpVar;
        }
        this.f47626f.getClass();
        if (!ff9Var.f71067e && !ff9Var.f71068f && !ff9Var.f71069g) {
            this.f47626f.getClass();
            if (xra0Var.mo27137h()) {
                xra0Var.mo27138i("afterDecoding({}): {}", Integer.valueOf(ff9Var.mo42159a().remaining()), ff9Var.mo42159a().remaining() > 1000 ? "too big to display" : new String(ff9Var.mo42159a().array()));
            }
            ff9Var.mo41513b();
            return ff9Var;
        }
        throw new InvalidFrameException("bad rsv RSV1: " + ff9Var.f71067e + " RSV2: " + ff9Var.f71068f + " RSV3: " + ff9Var.f71069g);
    }

    /* JADX INFO: renamed from: n */
    public final void m35684n(long j) throws LimitExceededException {
        xra0 xra0Var = this.f47622b;
        if (j > 2147483647L) {
            xra0Var.mo27145p("Limit exedeed: Payloadsize is to big...");
            throw new LimitExceededException("Payloadsize is to big...");
        }
        int i = this.f47633m;
        if (j > i) {
            xra0Var.mo27138i("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i), Long.valueOf(j));
            throw new LimitExceededException("Payload limit reached.", i);
        }
        if (j >= 0) {
            return;
        }
        xra0Var.mo27145p("Limit underflow: Payloadsize is to little...");
        throw new LimitExceededException("Payloadsize is to little...");
    }

    /* JADX INFO: renamed from: o */
    public final void m35685o(int i, int i2) throws IncompleteException {
        if (i >= i2) {
            return;
        }
        this.f47622b.mo27145p("Incomplete frame: maxpacketsize < realpacketsize");
        throw new IncompleteException(i2);
    }

    public final String toString() {
        String strM35680j = m35680j();
        if (this.f47623c != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(strM35680j);
            sb.append(" extension: ");
            this.f47623c.getClass();
            sb.append(bhp.class.getSimpleName());
            strM35680j = sb.toString();
        }
        if (this.f47627g != null) {
            ((q3t0) this.f47627g).getClass();
            strM35680j = strM35680j + " protocol: ";
        }
        return strM35680j + " max frame size: " + this.f47633m;
    }

    public dcs() {
        this(Alert.DURATION_SHOW_INDEFINITELY, Collections.EMPTY_LIST, Collections.singletonList(new q3t0()));
    }
}
