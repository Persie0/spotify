package p204p;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class duz0 implements Externalizable {

    /* JADX INFO: renamed from: a */
    public mec0 f53327a;

    public duz0(mec0 mec0Var) {
        this.f53327a = mec0Var;
    }

    private final Object readResolve() {
        return this.f53327a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException(s571.m77246e(b, "Unsupported flags value: "));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException(dq60.m36613m("Illegal size value: ", i, '.'));
        }
        mec0 mec0Var = new mec0(i);
        for (int i2 = 0; i2 < i; i2++) {
            mec0Var.put(objectInput.readObject(), objectInput.readObject());
        }
        this.f53327a = mec0Var.m61540b();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f53327a.f142675i);
        for (Map.Entry entry : (nec0) this.f53327a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
