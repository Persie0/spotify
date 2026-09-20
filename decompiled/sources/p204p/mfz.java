package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mfz extends ir1 {

    /* JADX INFO: renamed from: c */
    public final pd50[] f143242c;

    /* JADX WARN: Illegal instructions before constructor call */
    public mfz(int i, pd50[] pd50VarArr) {
        if (pd50VarArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i2 = 1;
        int length = pd50VarArr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            throw new IllegalStateException("Empty enum: " + pd50VarArr.getClass());
        }
        super(i, i2);
        this.f143242c = pd50VarArr;
    }

    @Override // p204p.ir1
    /* JADX INFO: renamed from: d */
    public final Object mo51423d(int i) {
        int i2 = (1 << this.f104881b) - 1;
        int i3 = this.f104880a;
        int i4 = (i & (i2 << i3)) >> i3;
        for (pd50 pd50Var : this.f143242c) {
            if (pd50Var.getNumber() == i4) {
                return pd50Var;
            }
        }
        return null;
    }
}
