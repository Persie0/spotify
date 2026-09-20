package p204p;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes11.dex */
public final class m1b1 implements Externalizable {

    /* JADX INFO: renamed from: a */
    public long f138923a;

    /* JADX INFO: renamed from: b */
    public long f138924b;

    private final Object readResolve() {
        long j = this.f138923a;
        long j2 = this.f138924b;
        return (j == 0 && j2 == 0) ? l1b1.f128680c : new l1b1(j, j2);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.f138923a = objectInput.readLong();
        this.f138924b = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.f138923a);
        objectOutput.writeLong(this.f138924b);
    }
}
