package p196j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;
import p196j$.time.temporal.EnumC1592a;

/* JADX INFO: renamed from: j$.time.u */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1611u implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a */
    public byte f10845a;

    /* JADX INFO: renamed from: b */
    public Object f10846b;

    public C1611u() {
    }

    /* JADX INFO: renamed from: a */
    public static Object m24180a(byte b, ObjectInput objectInput) throws IOException {
        switch (b) {
            case 1:
                Duration duration = Duration.ZERO;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f10608c;
                return Instant.m23942K(objectInput.readLong(), objectInput.readInt());
            case 3:
                C1579h c1579h = C1579h.f10779d;
                return C1579h.m24113h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return C1583l.m24139g0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f10613c;
                C1579h c1579h2 = C1579h.f10779d;
                return LocalDateTime.m23955T(C1579h.m24113h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C1583l.m24139g0(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f10613c;
                C1579h c1579h3 = C1579h.f10779d;
                LocalDateTime localDateTimeM23955T = LocalDateTime.m23955T(C1579h.m24113h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C1583l.m24139g0(objectInput));
                ZoneOffset zoneOffsetM23980f0 = ZoneOffset.m23980f0(objectInput);
                ZoneId zoneId = (ZoneId) m24180a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetM23980f0.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeM23955T, zoneId, zoneOffsetM23980f0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = C1616z.f10856d;
                return ZoneId.m23969E(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.m23980f0(objectInput);
            case 9:
                int i2 = C1590s.f10805c;
                return new C1590s(C1583l.m24139g0(objectInput), ZoneOffset.m23980f0(objectInput));
            case 10:
                int i3 = OffsetDateTime.f10617c;
                C1579h c1579h4 = C1579h.f10779d;
                return new OffsetDateTime(LocalDateTime.m23955T(C1579h.m24113h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C1583l.m24139g0(objectInput)), ZoneOffset.m23980f0(objectInput));
            case 11:
                int i4 = C1613w.f10849b;
                return C1613w.m24181r(objectInput.readInt());
            case 12:
                int i5 = C1615y.f10853c;
                int i6 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                EnumC1592a.YEAR.m24165a0(i6);
                EnumC1592a.MONTH_OF_YEAR.m24165a0(b2);
                return new C1615y(i6, b2);
            case 13:
                int i7 = C1587p.f10800c;
                byte b3 = objectInput.readByte();
                byte b4 = objectInput.readByte();
                EnumC1585n enumC1585nM24152T = EnumC1585n.m24152T(b3);
                Objects.requireNonNull(enumC1585nM24152T, "month");
                EnumC1592a.DAY_OF_MONTH.m24165a0(b4);
                if (b4 <= enumC1585nM24152T.m24154K()) {
                    return new C1587p(enumC1585nM24152T.getValue(), b4);
                }
                throw new C1512b("Illegal value for DayOfMonth field, value " + ((int) b4) + " is not valid for month " + enumC1585nM24152T.name());
            case 14:
                C1591t c1591t = C1591t.f10808d;
                return C1591t.m24159a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f10846b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b = objectInput.readByte();
        this.f10845a = b;
        this.f10846b = m24180a(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f10845a;
        Object obj = this.f10846b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f10606a);
                objectOutput.writeInt(duration.f10607b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f10611a);
                objectOutput.writeInt(instant.f10612b);
                return;
            case 3:
                C1579h c1579h = (C1579h) obj;
                objectOutput.writeInt(c1579h.f10781a);
                objectOutput.writeByte(c1579h.f10782b);
                objectOutput.writeByte(c1579h.f10783c);
                return;
            case 4:
                ((C1583l) obj).m24150l0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                C1579h c1579h2 = localDateTime.f10615a;
                objectOutput.writeInt(c1579h2.f10781a);
                objectOutput.writeByte(c1579h2.f10782b);
                objectOutput.writeByte(c1579h2.f10783c);
                localDateTime.f10616b.m24150l0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.f10627a;
                C1579h c1579h3 = localDateTime2.f10615a;
                objectOutput.writeInt(c1579h3.f10781a);
                objectOutput.writeByte(c1579h3.f10782b);
                objectOutput.writeByte(c1579h3.f10783c);
                localDateTime2.f10616b.m24150l0(objectOutput);
                zonedDateTime.f10628b.m23981g0(objectOutput);
                zonedDateTime.f10629c.mo23973Z(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((C1616z) obj).f10857b);
                return;
            case 8:
                ((ZoneOffset) obj).m23981g0(objectOutput);
                return;
            case 9:
                C1590s c1590s = (C1590s) obj;
                c1590s.f10806a.m24150l0(objectOutput);
                c1590s.f10807b.m23981g0(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f10618a;
                C1579h c1579h4 = localDateTime3.f10615a;
                objectOutput.writeInt(c1579h4.f10781a);
                objectOutput.writeByte(c1579h4.f10782b);
                objectOutput.writeByte(c1579h4.f10783c);
                localDateTime3.f10616b.m24150l0(objectOutput);
                offsetDateTime.f10619b.m23981g0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((C1613w) obj).f10850a);
                return;
            case 12:
                C1615y c1615y = (C1615y) obj;
                objectOutput.writeInt(c1615y.f10854a);
                objectOutput.writeByte(c1615y.f10855b);
                return;
            case 13:
                C1587p c1587p = (C1587p) obj;
                objectOutput.writeByte(c1587p.f10801a);
                objectOutput.writeByte(c1587p.f10802b);
                return;
            case 14:
                C1591t c1591t = (C1591t) obj;
                objectOutput.writeInt(c1591t.f10809a);
                objectOutput.writeInt(c1591t.f10810b);
                objectOutput.writeInt(c1591t.f10811c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public C1611u(byte b, Object obj) {
        this.f10845a = b;
        this.f10846b = obj;
    }
}
