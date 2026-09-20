package p204p;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes11.dex */
public final class n150 implements Externalizable {

    /* JADX INFO: renamed from: a */
    public long f149299a;

    /* JADX INFO: renamed from: b */
    public int f149300b;

    private final Object readResolve() {
        a150 a150Var = a150.f11335c;
        return qvf1.m74018o(this.f149300b, this.f149299a);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.f149299a = objectInput.readLong();
        this.f149300b = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.f149299a);
        objectOutput.writeInt(this.f149300b);
    }
}
