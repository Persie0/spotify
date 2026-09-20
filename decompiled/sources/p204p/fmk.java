package p204p;

import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidFrameException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class fmk {

    /* JADX INFO: renamed from: b */
    public final int f71064b;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f71070h;

    /* JADX INFO: renamed from: c */
    public ByteBuffer f71065c = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: a */
    public boolean f71063a = true;

    /* JADX INFO: renamed from: d */
    public boolean f71066d = false;

    /* JADX INFO: renamed from: e */
    public boolean f71067e = false;

    /* JADX INFO: renamed from: f */
    public boolean f71068f = false;

    /* JADX INFO: renamed from: g */
    public boolean f71069g = false;

    public fmk(int i, int i2) {
        this.f71070h = i2;
        this.f71064b = i;
    }

    /* JADX INFO: renamed from: a */
    public ByteBuffer mo42159a() {
        return this.f71065c;
    }

    /* JADX INFO: renamed from: b */
    public void mo41513b() throws InvalidFrameException {
        switch (this.f71070h) {
            case 0:
                if (!this.f71063a) {
                    throw new InvalidFrameException("Control frame can't have fin==false set");
                }
                if (this.f71067e) {
                    throw new InvalidFrameException("Control frame can't have rsv1==true set");
                }
                if (this.f71068f) {
                    throw new InvalidFrameException("Control frame can't have rsv2==true set");
                }
                if (this.f71069g) {
                    throw new InvalidFrameException("Control frame can't have rsv3==true set");
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo42160d(ByteBuffer byteBuffer) {
        this.f71065c = byteBuffer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fmk fmkVar = (fmk) obj;
        if (this.f71063a != fmkVar.f71063a || this.f71066d != fmkVar.f71066d || this.f71067e != fmkVar.f71067e || this.f71068f != fmkVar.f71068f || this.f71069g != fmkVar.f71069g || this.f71064b != fmkVar.f71064b) {
            return false;
        }
        ByteBuffer byteBuffer = this.f71065c;
        ByteBuffer byteBuffer2 = fmkVar.f71065c;
        if (byteBuffer != null) {
            return byteBuffer.equals(byteBuffer2);
        }
        return byteBuffer2 == null;
    }

    public int hashCode() {
        int iM38547C = (((this.f71063a ? 1 : 0) * 31) + edb.m38547C(this.f71064b)) * 31;
        ByteBuffer byteBuffer = this.f71065c;
        return ((((((((iM38547C + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.f71066d ? 1 : 0)) * 31) + (this.f71067e ? 1 : 0)) * 31) + (this.f71068f ? 1 : 0)) * 31) + (this.f71069g ? 1 : 0);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Framedata{ opcode:");
        switch (this.f71064b) {
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
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", fin:");
        sb.append(this.f71063a);
        sb.append(", rsv1:");
        sb.append(this.f71067e);
        sb.append(", rsv2:");
        sb.append(this.f71068f);
        sb.append(", rsv3:");
        sb.append(this.f71069g);
        sb.append(", payload length:[pos:");
        sb.append(this.f71065c.position());
        sb.append(", len:");
        sb.append(this.f71065c.remaining());
        sb.append("], payload:");
        sb.append(this.f71065c.remaining() > 1000 ? "(too big to display)" : new String(this.f71065c.array()));
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private void m42158c() {
    }
}
