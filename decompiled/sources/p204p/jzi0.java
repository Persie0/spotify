package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class jzi0 extends nzi0 {

    /* JADX INFO: renamed from: s */
    public final Class f117737s;

    public jzi0(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.f117737s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // p204p.nzi0, p204p.ozi0
    /* JADX INFO: renamed from: b */
    public final String mo38908b() {
        return this.f117737s.getName();
    }

    @Override // p204p.nzi0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum mo38910d(String str) {
        Object obj;
        Class cls = this.f117737s;
        Object[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (bm51.m29797h0(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r4 = (Enum) obj;
        if (r4 != null) {
            return r4;
        }
        StringBuilder sbM38572u = edb.m38572u("Enum value ", str, " not found for type ");
        sbM38572u.append(cls.getName());
        sbM38572u.append('.');
        throw new IllegalArgumentException(sbM38572u.toString());
    }
}
