package p204p;

import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExceededException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;

/* JADX INFO: loaded from: classes16.dex */
public final class sld1 implements nld1 {

    /* JADX INFO: renamed from: c */
    public final xld1 f210399c;

    /* JADX INFO: renamed from: f */
    public final dcs f210402f;

    /* JADX INFO: renamed from: g */
    public final int f210403g;

    /* JADX INFO: renamed from: a */
    public final xra0 f210397a = bsa0.m30425b(sld1.class);

    /* JADX INFO: renamed from: d */
    public boolean f210400d = false;

    /* JADX INFO: renamed from: e */
    public volatile int f210401e = 1;

    /* JADX INFO: renamed from: h */
    public ByteBuffer f210404h = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: i */
    public ec20 f210405i = null;

    /* JADX INFO: renamed from: t */
    public String f210406t = null;

    /* JADX INFO: renamed from: X */
    public Integer f210394X = null;

    /* JADX INFO: renamed from: Y */
    public Boolean f210395Y = null;

    /* JADX INFO: renamed from: Z */
    public long f210396Z = System.nanoTime();

    /* JADX INFO: renamed from: L0 */
    public final Object f210393L0 = new Object();

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue f210398b = new LinkedBlockingQueue();

    public sld1(xld1 xld1Var, dcs dcsVar) {
        this.f210402f = null;
        new LinkedBlockingQueue();
        this.f210399c = xld1Var;
        this.f210403g = 1;
        ArrayList arrayList = new ArrayList();
        Iterator it = dcsVar.f47625e.iterator();
        while (it.hasNext()) {
            ((bhp) it.next()).getClass();
            arrayList.add(new bhp());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = dcsVar.f47628h.iterator();
        while (it2.hasNext()) {
            ((q3t0) ((tx30) it2.next())).getClass();
            arrayList2.add(new q3t0());
        }
        this.f210402f = new dcs(dcsVar.f47633m, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m78458a(String str, int i, boolean z) {
        if (this.f210401e == 3 || this.f210401e == 4) {
            return;
        }
        boolean z2 = true;
        if (this.f210401e == 2) {
            if (i == 1006) {
                this.f210401e = 3;
                m78465h(str, i, false);
                return;
            }
            this.f210402f.getClass();
            try {
                if (!z) {
                    try {
                        this.f210399c.getClass();
                    } catch (RuntimeException e) {
                        this.f210399c.m91427g(e);
                    }
                }
                if (this.f210401e != 2) {
                    z2 = false;
                }
                if (z2) {
                    tse tseVar = new tse();
                    tseVar.f223290j = str == null ? "" : str;
                    tseVar.m81412e();
                    tseVar.f223289i = i;
                    if (i == 1015) {
                        tseVar.f223289i = 1005;
                        tseVar.f223290j = "";
                    }
                    tseVar.m81412e();
                    tseVar.mo41513b();
                    m78471n(tseVar);
                }
            } catch (InvalidDataException e2) {
                this.f210397a.mo27136g(e2, "generated frame is invalid");
                this.f210399c.m91427g(e2);
                m78465h("generated frame is invalid", 1006, false);
            }
            m78465h(str, i, z);
        } else if (i == -3) {
            m78465h(str, -3, true);
        } else if (i == 1002) {
            m78465h(str, i, z);
        } else {
            m78465h(str, -1, false);
        }
        this.f210401e = 3;
        this.f210404h = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m78459b() {
        m78458a("", 1000, false);
    }

    /* JADX INFO: renamed from: c */
    public final void m78460c(int i, String str) {
        m78461d(str, i, false);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m78461d(String str, int i, boolean z) {
        if (this.f210401e == 4) {
            return;
        }
        if (this.f210401e == 2 && i == 1006) {
            this.f210401e = 3;
        }
        try {
            this.f210399c.m91428h(str, i, z);
        } catch (RuntimeException e) {
            this.f210399c.m91427g(e);
        }
        dcs dcsVar = this.f210402f;
        if (dcsVar != null) {
            dcsVar.f47631k = null;
            dcsVar.f47623c = new bhp();
            dcsVar.f47627g = null;
        }
        this.f210405i = null;
        this.f210401e = 4;
    }

    /* JADX INFO: renamed from: e */
    public final void m78462e(ByteBuffer byteBuffer) throws Throwable {
        ByteBuffer byteBuffer2;
        this.f210397a.mo27138i("process({}): ({})", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
        if (this.f210401e != 1) {
            if (this.f210401e == 2) {
                m78463f(byteBuffer);
                return;
            }
            return;
        }
        xld1 xld1Var = this.f210399c;
        xra0 xra0Var = this.f210397a;
        if (this.f210404h.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.f210404h.remaining() < byteBuffer.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f210404h.capacity() + byteBuffer.remaining());
                this.f210404h.flip();
                byteBufferAllocate.put(this.f210404h);
                this.f210404h = byteBufferAllocate;
            }
            this.f210404h.put(byteBuffer);
            this.f210404h.flip();
            byteBuffer2 = this.f210404h;
        }
        byteBuffer2.mark();
        try {
            try {
                int i = this.f210403g;
                if (i == 2) {
                    dcs dcsVar = this.f210402f;
                    dcsVar.getClass();
                    hc20 hc20VarM35682l = dcsVar.m35682l(byteBuffer2);
                    if (!(hc20VarM35682l instanceof ec20)) {
                        xra0Var.mo27145p("Closing due to protocol error: wrong http function");
                        m78465h("wrong http function", 1002, false);
                        return;
                    }
                    ec20 ec20Var = (ec20) hc20VarM35682l;
                    if (this.f210402f.m35673b(ec20Var) != 1) {
                        xra0Var.mo27145p("Closing due to protocol error: the handshake did finally not match");
                        m78458a("the handshake did finally not match", 1002, false);
                        return;
                    }
                    m78468k(ec20Var);
                } else {
                    if (i != 1) {
                        return;
                    }
                    dcs dcsVar2 = this.f210402f;
                    dcsVar2.f47621a = i;
                    hc20 hc20VarM35682l2 = dcsVar2.m35682l(byteBuffer2);
                    if (!(hc20VarM35682l2 instanceof fc20)) {
                        xra0Var.mo27145p("Closing due to protocol error: wrong http function");
                        m78465h("wrong http function", 1002, false);
                        return;
                    }
                    fc20 fc20Var = (fc20) hc20VarM35682l2;
                    if (this.f210402f.m35672a(this.f210405i, fc20Var) != 1) {
                        xra0Var.mo27141l(this.f210402f, "Closing due to protocol error: draft {} refuses handshake");
                        m78458a("draft " + this.f210402f + " refuses handshake", 1002, false);
                        return;
                    }
                    try {
                        xld1Var.getClass();
                        m78468k(fc20Var);
                    } catch (RuntimeException e) {
                        xra0Var.mo27136g(e, "Closing since client was never connected");
                        xld1Var.m91427g(e);
                        m78465h(e.getMessage(), -1, false);
                        return;
                    } catch (InvalidDataException e2) {
                        xra0Var.mo27139j("Closing due to invalid data exception. Possible handshake rejection", e2);
                        m78465h(e2.getMessage(), e2.f10960a, false);
                        return;
                    }
                }
                if (m78467j() || m78466i()) {
                    return;
                }
                if (byteBuffer.hasRemaining()) {
                    m78463f(byteBuffer);
                } else if (this.f210404h.hasRemaining()) {
                    m78463f(this.f210404h);
                }
            } catch (InvalidHandshakeException e3) {
                xra0Var.mo27139j("Closing due to invalid handshake", e3);
                m78458a(e3.getMessage(), e3.f10960a, false);
            }
        } catch (IncompleteHandshakeException e4) {
            if (this.f210404h.capacity() != 0) {
                ByteBuffer byteBuffer3 = this.f210404h;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.f210404h;
                byteBuffer4.limit(byteBuffer4.capacity());
                return;
            }
            byteBuffer2.reset();
            int iCapacity = e4.f10959a;
            if (iCapacity == 0) {
                iCapacity = byteBuffer2.capacity() + 16;
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iCapacity);
            this.f210404h = byteBufferAllocate2;
            byteBufferAllocate2.put(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m78463f(ByteBuffer byteBuffer) throws Throwable {
        xld1 xld1Var = this.f210399c;
        xra0 xra0Var = this.f210397a;
        try {
            for (fmk fmkVar : this.f210402f.m35681k(byteBuffer)) {
                xra0Var.mo27141l(fmkVar, "matched frame: {}");
                this.f210402f.m35679h(this, fmkVar);
            }
        } catch (LinkageError e) {
            e = e;
            xra0Var.mo27134e("Got fatal error during frame processing");
            throw e;
        } catch (ThreadDeath e2) {
            e = e2;
            xra0Var.mo27134e("Got fatal error during frame processing");
            throw e;
        } catch (VirtualMachineError e3) {
            e = e3;
            xra0Var.mo27134e("Got fatal error during frame processing");
            throw e;
        } catch (Error e4) {
            xra0Var.mo27134e("Closing web socket due to an error during frame processing");
            xld1Var.m91427g(new Exception(e4));
            m78458a("Got error ".concat(e4.getClass().getName()), CollectionItemdata$ItemData.YL_FILTER_ITEM_DATA_FIELD_NUMBER, false);
        } catch (LimitExceededException e5) {
            if (e5.f10961b == Integer.MAX_VALUE) {
                xra0Var.mo27136g(e5, "Closing due to invalid size of frame");
                xld1Var.m91427g(e5);
            }
            m78458a(e5.getMessage(), e5.f10960a, false);
        } catch (InvalidDataException e6) {
            xra0Var.mo27136g(e6, "Closing due to invalid data in frame");
            xld1Var.m91427g(e6);
            m78458a(e6.getMessage(), e6.f10960a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m78464g() {
        if (this.f210401e == 1) {
            m78461d("", -1, true);
            return;
        }
        if (this.f210400d) {
            m78461d(this.f210406t, this.f210394X.intValue(), this.f210395Y.booleanValue());
        } else {
            this.f210402f.getClass();
            this.f210402f.getClass();
            m78461d("", 1006, true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m78465h(String str, int i, boolean z) {
        if (this.f210400d) {
            return;
        }
        this.f210394X = Integer.valueOf(i);
        this.f210406t = str;
        this.f210395Y = Boolean.valueOf(z);
        this.f210400d = true;
        this.f210399c.getClass();
        try {
            this.f210399c.getClass();
        } catch (RuntimeException e) {
            this.f210397a.mo27136g(e, "Exception in onWebsocketClosing");
            this.f210399c.m91427g(e);
        }
        dcs dcsVar = this.f210402f;
        if (dcsVar != null) {
            dcsVar.f47631k = null;
            dcsVar.f47623c = new bhp();
            dcsVar.f47627g = null;
        }
        this.f210405i = null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m78466i() {
        return this.f210401e == 4;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m78467j() {
        return this.f210401e == 3;
    }

    /* JADX INFO: renamed from: k */
    public final void m78468k(gc20 gc20Var) {
        this.f210397a.mo27141l(this.f210402f, "open using draft: {}");
        this.f210401e = 2;
        this.f210396Z = System.nanoTime();
        try {
            this.f210399c.m91431k(gc20Var);
        } catch (RuntimeException e) {
            this.f210399c.m91427g(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m78469l(List list) {
        int i;
        String str;
        byte b;
        if (this.f210401e != 2) {
            throw new WebsocketNotConnectedException();
        }
        if (list == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fmk fmkVar = (fmk) it.next();
            this.f210397a.mo27141l(fmkVar, "send frame: {}");
            dcs dcsVar = this.f210402f;
            dcsVar.f47623c.getClass();
            xra0 xra0Var = dcsVar.f47622b;
            if (xra0Var.mo27137h()) {
                xra0Var.mo27138i("afterEnconding({}): {}", Integer.valueOf(fmkVar.mo42159a().remaining()), fmkVar.mo42159a().remaining() > 1000 ? "too big to display" : new String(fmkVar.mo42159a().array()));
            }
            ByteBuffer byteBufferMo42159a = fmkVar.mo42159a();
            boolean z = dcsVar.f47621a == 1;
            if (byteBufferMo42159a.remaining() <= 125) {
                i = 1;
            } else {
                i = byteBufferMo42159a.remaining() <= 65535 ? 2 : 8;
            }
            int i2 = 4;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i > 1 ? i + 1 : i) + 1 + (z ? 4 : 0) + byteBufferMo42159a.remaining());
            int i3 = fmkVar.f71064b;
            if (i3 == 1) {
                b = 0;
            } else if (i3 == 2) {
                b = 1;
            } else if (i3 == 3) {
                b = 2;
            } else if (i3 == 6) {
                b = 8;
            } else if (i3 == 4) {
                b = 9;
            } else {
                if (i3 != 5) {
                    switch (i3) {
                        case 1:
                            str = "CONTINUOUS";
                            break;
                        case 2:
                            str = "TEXT";
                            break;
                        case 3:
                            str = "BINARY";
                            break;
                        case 4:
                            str = "PING";
                            break;
                        case 5:
                            str = "PONG";
                            break;
                        case 6:
                            str = "CLOSING";
                            break;
                        default:
                            throw null;
                    }
                    throw new IllegalArgumentException("Don't know how to handle ".concat(str));
                }
                b = 10;
            }
            byte b2 = (byte) (b | ((byte) (fmkVar.f71063a ? -128 : 0)));
            if (fmkVar.f71067e) {
                b2 = (byte) (b2 | 64);
            }
            if (fmkVar.f71068f) {
                b2 = (byte) (b2 | 32);
            }
            if (fmkVar.f71069g) {
                b2 = (byte) (b2 | 16);
            }
            byteBufferAllocate.put(b2);
            long jRemaining = byteBufferMo42159a.remaining();
            byte[] bArr = new byte[i];
            int i4 = (i * 8) - 8;
            int i5 = 0;
            while (i5 < i) {
                long j = jRemaining;
                bArr[i5] = (byte) (j >>> (i4 - (i5 * 8)));
                i5++;
                i2 = i2;
                jRemaining = j;
            }
            int i6 = i2;
            if (i == 1) {
                byteBufferAllocate.put((byte) (bArr[0] | (z ? (byte) -128 : (byte) 0)));
            } else if (i == 2) {
                byteBufferAllocate.put((byte) ((z ? (byte) -128 : (byte) 0) | 126));
                byteBufferAllocate.put(bArr);
            } else {
                if (i != 8) {
                    throw new IllegalStateException("Size representation not supported/specified");
                }
                byteBufferAllocate.put((byte) ((z ? (byte) -128 : (byte) 0) | 127));
                byteBufferAllocate.put(bArr);
            }
            if (z) {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i6);
                byteBufferAllocate2.putInt(dcsVar.f47632l.nextInt());
                byteBufferAllocate.put(byteBufferAllocate2.array());
                int i7 = 0;
                while (byteBufferMo42159a.hasRemaining()) {
                    byteBufferAllocate.put((byte) (byteBufferMo42159a.get() ^ byteBufferAllocate2.get(i7 % 4)));
                    i7++;
                }
            } else {
                byteBufferAllocate.put(byteBufferMo42159a);
                byteBufferMo42159a.flip();
            }
            byteBufferAllocate.flip();
            arrayList.add(byteBufferAllocate);
        }
        m78473p(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public final void m78470m(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (byteBufferWrap == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        boolean z = this.f210403g == 1;
        this.f210402f.getClass();
        ff9 ff9Var = new ff9(3, 0);
        ff9Var.f71065c = byteBufferWrap;
        ff9Var.f71066d = z;
        m78469l(Collections.singletonList(ff9Var));
    }

    /* JADX INFO: renamed from: n */
    public final void m78471n(fmk fmkVar) {
        m78469l(Collections.singletonList(fmkVar));
    }

    /* JADX INFO: renamed from: o */
    public final void m78472o(ec20 ec20Var) throws InvalidHandshakeException {
        String strM81892g;
        xld1 xld1Var = this.f210399c;
        dcs dcsVar = this.f210402f;
        dcsVar.getClass();
        ec20Var.m47093d("Upgrade", "websocket");
        ec20Var.m47093d("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        dcsVar.f47632l.nextBytes(bArr);
        try {
            strM81892g = tx8.m81892g(bArr, 16);
        } catch (IOException unused) {
            strM81892g = null;
        }
        ec20Var.m47093d("Sec-WebSocket-Key", strM81892g);
        ec20Var.m47093d("Sec-WebSocket-Version", "13");
        StringBuilder sb = new StringBuilder();
        Iterator it = dcsVar.f47625e.iterator();
        while (it.hasNext()) {
            ((bhp) it.next()).getClass();
        }
        if (sb.length() != 0) {
            ec20Var.m47093d("Sec-WebSocket-Extensions", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = dcsVar.f47628h.iterator();
        while (it2.hasNext()) {
            ((q3t0) ((tx30) it2.next())).getClass();
        }
        if (sb2.length() != 0) {
            ec20Var.m47093d("Sec-WebSocket-Protocol", sb2.toString());
        }
        this.f210405i = ec20Var;
        try {
            xld1Var.getClass();
            ec20 ec20Var2 = this.f210405i;
            dcsVar.getClass();
            StringBuilder sb3 = new StringBuilder(100);
            if (ec20Var2 == null) {
                throw new IllegalArgumentException("unknown role");
            }
            sb3.append("GET ");
            sb3.append(ec20Var2.f58216b);
            sb3.append(" HTTP/1.1");
            sb3.append("\r\n");
            for (String str : Collections.unmodifiableSet(((TreeMap) ec20Var2.f89665a).keySet())) {
                String strM47091b = ec20Var2.m47091b(str);
                sb3.append(str);
                sb3.append(": ");
                sb3.append(strM47091b);
                sb3.append("\r\n");
            }
            sb3.append("\r\n");
            String string = sb3.toString();
            CodingErrorAction codingErrorAction = uuc.f234148a;
            byte[] bytes = string.getBytes(StandardCharsets.US_ASCII);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length);
            byteBufferAllocate.put(bytes);
            byteBufferAllocate.flip();
            m78473p(Collections.singletonList(byteBufferAllocate));
        } catch (RuntimeException e) {
            this.f210397a.mo27136g(e, "Exception in startHandshake");
            xld1Var.m91427g(e);
            throw new InvalidHandshakeException("rejected because of " + e);
        } catch (InvalidDataException unused2) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m78473p(List list) {
        synchronized (this.f210393L0) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ByteBuffer byteBuffer = (ByteBuffer) it.next();
                    this.f210397a.mo27138i("write({}): {}", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
                    this.f210398b.add(byteBuffer);
                    this.f210399c.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
