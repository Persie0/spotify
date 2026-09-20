package p204p;

import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: p.m8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2118m8 implements pre0 {
    protected int memoizedHashCode;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC2081l8.addAll((Iterable) iterable, (List) list);
    }

    public static void checkByteStringIsUtf8(gva gvaVar) {
        if (!gvaVar.mo34017n()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m61095a(String str) {
        return dq60.m36615o("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public abstract int getSerializedSize(lgy0 lgy0Var);

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    @Override // p204p.pre0
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = uwe.f234637i;
            qwe qweVar = new qwe(bArr, serializedSize);
            writeTo(qweVar);
            if (qweVar.m74076l0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m61095a("byte array"), e);
        }
    }

    @Override // p204p.pre0
    public gva toByteString() {
        try {
            int serializedSize = getSerializedSize();
            cva cvaVar = gva.f84678b;
            nt7 nt7Var = new nt7(serializedSize);
            writeTo(nt7Var.m65606h());
            return nt7Var.m65602a();
        } catch (IOException e) {
            throw new RuntimeException(m61095a("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iM84099N = uwe.m84099N(serializedSize) + serializedSize;
        if (iM84099N > 4096) {
            iM84099N = 4096;
        }
        swe sweVar = new swe(outputStream, iM84099N);
        sweVar.mo74073i0(serializedSize);
        writeTo(sweVar);
        if (sweVar.f214653m > 0) {
            sweVar.m79547q0();
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = uwe.f234637i;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        swe sweVar = new swe(outputStream, serializedSize);
        writeTo(sweVar);
        if (sweVar.f214653m > 0) {
            sweVar.m79547q0();
        }
    }
}
