package p204p;

import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;

/* JADX INFO: loaded from: classes16.dex */
public final class tse extends fmk {

    /* JADX INFO: renamed from: i */
    public int f223289i;

    /* JADX INFO: renamed from: j */
    public String f223290j;

    public tse() {
        super(6, 0);
        this.f223290j = "";
        m81412e();
        this.f223289i = 1000;
        m81412e();
    }

    @Override // p204p.fmk
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo42159a() {
        return this.f223289i == 1005 ? ByteBuffer.allocate(0) : this.f71065c;
    }

    @Override // p204p.fmk
    /* JADX INFO: renamed from: b */
    public final void mo41513b() throws InvalidDataException {
        super.mo41513b();
        if (this.f223289i == 1007 && this.f223290j.isEmpty()) {
            throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
        }
        if (this.f223289i == 1005 && this.f223290j.length() > 0) {
            throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
        }
        int i = this.f223289i;
        if (i > 1015 && i < 3000) {
            throw new InvalidDataException(1002, "Trying to send an illegal close code!");
        }
        if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
            throw new InvalidFrameException("closecode must not be sent over the wire: " + this.f223289i);
        }
    }

    @Override // p204p.fmk
    /* JADX INFO: renamed from: d */
    public final void mo42160d(ByteBuffer byteBuffer) {
        this.f223289i = 1005;
        this.f223290j = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.f223289i = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.f223289i = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(2);
            byteBufferAllocate.putShort(byteBuffer.getShort());
            byteBufferAllocate.position(0);
            this.f223289i = byteBufferAllocate.getInt();
        }
        byteBuffer.reset();
        try {
            int iPosition = byteBuffer.position();
            try {
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.f223290j = uuc.m83977b(byteBuffer);
                    byteBuffer.position(iPosition);
                } catch (IllegalArgumentException unused) {
                    throw new InvalidDataException(1007);
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                throw th;
            }
        } catch (InvalidDataException unused2) {
            this.f223289i = 1007;
            this.f223290j = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m81412e() {
        String str = this.f223290j;
        CodingErrorAction codingErrorAction = uuc.f234148a;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(this.f223289i);
        byteBufferAllocate.position(2);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bytes.length + 2);
        byteBufferAllocate2.put(byteBufferAllocate);
        byteBufferAllocate2.put(bytes);
        byteBufferAllocate2.rewind();
        this.f71065c = byteBufferAllocate2;
    }

    @Override // p204p.fmk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tse.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        tse tseVar = (tse) obj;
        if (this.f223289i != tseVar.f223289i) {
            return false;
        }
        String str = this.f223290j;
        String str2 = tseVar.f223290j;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    @Override // p204p.fmk
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + this.f223289i) * 31;
        String str = this.f223290j;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p204p.fmk
    public final String toString() {
        return super.toString() + "code: " + this.f223289i;
    }
}
