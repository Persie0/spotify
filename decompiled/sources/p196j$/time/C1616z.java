package p196j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;
import p196j$.time.zone.C1622f;
import p196j$.time.zone.C1624h;
import p196j$.time.zone.ZoneRules;

/* JADX INFO: renamed from: j$.time.z */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1616z extends ZoneId {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f10856d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: b */
    public final String f10857b;

    /* JADX INFO: renamed from: c */
    public final transient ZoneRules f10858c;

    public C1616z(String str, ZoneRules zoneRules) {
        this.f10857b = str;
        this.f10858c = zoneRules;
    }

    /* JADX INFO: renamed from: a0 */
    public static C1616z m24191a0(String str, boolean z) {
        ZoneRules zoneRulesM24207a;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length < 2) {
            throw new C1512b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                throw new C1512b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            }
        }
        try {
            zoneRulesM24207a = C1624h.m24207a(str);
        } catch (C1622f e) {
            if (z) {
                throw e;
            }
            zoneRulesM24207a = null;
        }
        return new C1616z(str, zoneRulesM24207a);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1611u((byte) 7, this);
    }

    @Override // p196j$.time.ZoneId
    /* JADX INFO: renamed from: Z */
    public final void mo23973Z(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f10857b);
    }

    @Override // p196j$.time.ZoneId
    public final ZoneRules getRules() {
        ZoneRules zoneRules = this.f10858c;
        return zoneRules != null ? zoneRules : C1624h.m24207a(this.f10857b);
    }

    @Override // p196j$.time.ZoneId
    /* JADX INFO: renamed from: o */
    public final String mo23974o() {
        return this.f10857b;
    }
}
