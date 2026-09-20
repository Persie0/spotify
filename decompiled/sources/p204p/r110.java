package p204p;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class r110 implements r2n0 {

    /* JADX INFO: renamed from: b */
    public static final aux f194681b = aux.m27220a();

    /* JADX INFO: renamed from: a */
    public final AbstractC0269h f194682a;

    public r110(AbstractC0269h abstractC0269h) {
        this.f194682a = abstractC0269h;
    }

    /* JADX INFO: renamed from: a */
    public static void m74431a(AbstractC0269h abstractC0269h) throws InvalidProtocolBufferException {
        if (abstractC0269h == null || abstractC0269h.isInitialized()) {
            return;
        }
        UninitializedMessageException uninitializedMessageExceptionNewUninitializedMessageException = abstractC0269h.newUninitializedMessageException();
        uninitializedMessageExceptionNewUninitializedMessageException.getClass();
        throw new InvalidProtocolBufferException(uninitializedMessageExceptionNewUninitializedMessageException.getMessage());
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0269h m74432b(InputStream inputStream, aux auxVar) {
        owe oweVarM68167g = owe.m68167g(inputStream);
        AbstractC0269h partialFrom = AbstractC0269h.parsePartialFrom(this.f194682a, oweVarM68167g, auxVar);
        oweVarM68167g.mo2020a(0);
        m74431a(partialFrom);
        return partialFrom;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0269h m74433c(byte[] bArr) throws InvalidProtocolBufferException {
        AbstractC0269h abstractC0269hM2123m = AbstractC0269h.m2123m(this.f194682a, bArr, bArr.length, f194681b);
        m74431a(abstractC0269hM2123m);
        return abstractC0269hM2123m;
    }
}
