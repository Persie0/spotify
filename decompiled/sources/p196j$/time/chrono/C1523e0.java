package p196j$.time.chrono;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;
import p196j$.time.C1579h;
import p196j$.time.C1583l;
import p196j$.time.ZoneId;
import p196j$.time.ZoneOffset;
import p196j$.time.temporal.EnumC1592a;

/* JADX INFO: renamed from: j$.time.chrono.e0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1523e0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a */
    public byte f10641a;

    /* JADX INFO: renamed from: b */
    public Object f10642b;

    public C1523e0() {
    }

    private Object readResolve() {
        return this.f10642b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objM24038of;
        byte b = objectInput.readByte();
        this.f10641a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC1514a.f10633a;
                objM24038of = InterfaceC1535l.m24038of(objectInput.readUTF());
                break;
            case 2:
                objM24038of = ((InterfaceC1516b) objectInput.readObject()).mo24012N((C1583l) objectInput.readObject());
                break;
            case 3:
                objM24038of = ((ChronoLocalDateTime) objectInput.readObject()).mo23957J((ZoneOffset) objectInput.readObject()).mo23985I((ZoneId) objectInput.readObject());
                break;
            case 4:
                C1579h c1579h = C1547x.f10685d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                C1545v.f10683c.getClass();
                objM24038of = new C1547x(C1579h.m24113h0(i, b2, b3));
                break;
            case 5:
                C1548y c1548y = C1548y.f10689d;
                objM24038of = C1548y.m24059p(objectInput.readByte());
                break;
            case 6:
                C1538o c1538o = (C1538o) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                c1538o.getClass();
                objM24038of = new C1540q(c1538o, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                C1515a0.f10635c.getClass();
                objM24038of = new C1519c0(C1579h.m24113h0(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                C1527g0.f10651c.getClass();
                objM24038of = new C1531i0(C1579h.m24113h0(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = C1526g.f10646e;
                objM24038of = new C1526g(InterfaceC1535l.m24038of(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f10642b = objM24038of;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f10641a;
        Object obj = this.f10642b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC1514a) obj).mo24008o());
                return;
            case 2:
                C1524f c1524f = (C1524f) obj;
                objectOutput.writeObject(c1524f.f10643a);
                objectOutput.writeObject(c1524f.f10644b);
                return;
            case 3:
                C1534k c1534k = (C1534k) obj;
                objectOutput.writeObject(c1534k.f10658a);
                objectOutput.writeObject(c1534k.f10659b);
                objectOutput.writeObject(c1534k.f10660c);
                return;
            case 4:
                C1547x c1547x = (C1547x) obj;
                c1547x.getClass();
                objectOutput.writeInt(c1547x.mo23952g(EnumC1592a.YEAR));
                objectOutput.writeByte(c1547x.mo23952g(EnumC1592a.MONTH_OF_YEAR));
                objectOutput.writeByte(c1547x.mo23952g(EnumC1592a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((C1548y) obj).f10691a);
                return;
            case 6:
                C1540q c1540q = (C1540q) obj;
                objectOutput.writeObject(c1540q.f10673a);
                objectOutput.writeInt(c1540q.mo23952g(EnumC1592a.YEAR));
                objectOutput.writeByte(c1540q.mo23952g(EnumC1592a.MONTH_OF_YEAR));
                objectOutput.writeByte(c1540q.mo23952g(EnumC1592a.DAY_OF_MONTH));
                return;
            case 7:
                C1519c0 c1519c0 = (C1519c0) obj;
                c1519c0.getClass();
                objectOutput.writeInt(c1519c0.mo23952g(EnumC1592a.YEAR));
                objectOutput.writeByte(c1519c0.mo23952g(EnumC1592a.MONTH_OF_YEAR));
                objectOutput.writeByte(c1519c0.mo23952g(EnumC1592a.DAY_OF_MONTH));
                return;
            case 8:
                C1531i0 c1531i0 = (C1531i0) obj;
                c1531i0.getClass();
                objectOutput.writeInt(c1531i0.mo23952g(EnumC1592a.YEAR));
                objectOutput.writeByte(c1531i0.mo23952g(EnumC1592a.MONTH_OF_YEAR));
                objectOutput.writeByte(c1531i0.mo23952g(EnumC1592a.DAY_OF_MONTH));
                return;
            case 9:
                C1526g c1526g = (C1526g) obj;
                objectOutput.writeUTF(c1526g.f10647a.mo24008o());
                objectOutput.writeInt(c1526g.f10648b);
                objectOutput.writeInt(c1526g.f10649c);
                objectOutput.writeInt(c1526g.f10650d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public C1523e0(byte b, Object obj) {
        this.f10641a = b;
        this.f10642b = obj;
    }
}
