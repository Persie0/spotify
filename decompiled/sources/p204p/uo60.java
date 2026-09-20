package p204p;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class uo60 implements s2n0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f232340a;

    static {
        int i = bux.f31229b;
    }

    public /* synthetic */ uo60(int i) {
        this.f232340a = i;
    }

    @Override // p204p.s2n0
    /* JADX INFO: renamed from: a */
    public final Object mo77051a(pwe pweVar, bux buxVar) {
        switch (this.f232340a) {
            case 0:
                return new wo60(pweVar);
            case 1:
                return new xo60(pweVar);
            case 2:
                return new zo60(pweVar, buxVar);
            case 3:
                return new ep60(pweVar, buxVar);
            case 4:
                return new dp60(pweVar);
            case 5:
                return new wzs0(pweVar, buxVar);
            case 6:
                return new uzs0(pweVar, buxVar);
            case 7:
                return new tzs0(pweVar, buxVar);
            case 8:
                return new zzs0(pweVar, buxVar);
            case 9:
                return new a0t0(pweVar);
            case 10:
                return new c0t0(pweVar, buxVar);
            case 11:
                return new e0t0(pweVar, buxVar);
            case 12:
                return new j0t0(pweVar, buxVar);
            case 13:
                return new l0t0(pweVar, buxVar);
            case 14:
                return new o0t0(pweVar, buxVar);
            case 15:
                return new q0t0(pweVar, buxVar);
            case 16:
                return new u0t0(pweVar, buxVar);
            case 17:
                return new w0t0(pweVar, buxVar);
            case 18:
                return new y0t0(pweVar, buxVar);
            case 19:
                return new c1t0(pweVar, buxVar);
            case 20:
                return new b1t0(pweVar);
            case 21:
                return new e1t0(pweVar);
            case 22:
                return new j1t0(pweVar, buxVar);
            case 23:
                return new h1t0(pweVar, buxVar);
            case 24:
                return new l1t0(pweVar, buxVar);
            case 25:
                return new o1t0(pweVar, buxVar);
            case 26:
                return new p1t0(pweVar, buxVar);
            case 27:
                return new r1t0(pweVar, buxVar);
            case 28:
                return new v1t0(pweVar);
            default:
                return new w1t0(pweVar, buxVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 m83592b(ByteArrayInputStream byteArrayInputStream, bux buxVar) throws InvalidProtocolBufferException {
        AbstractC2155n8 abstractC2155n8;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                abstractC2155n8 = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 < 32) {
                            int i3 = byteArrayInputStream.read();
                            if (i3 == -1) {
                                throw InvalidProtocolBufferException.m24218b();
                            }
                            i |= (i3 & 127) << i2;
                            if ((i3 & 128) == 0) {
                                break;
                            }
                            i2 += 7;
                        } else {
                            while (true) {
                                if (i2 >= 64) {
                                    throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                                }
                                int i4 = byteArrayInputStream.read();
                                if (i4 == -1) {
                                    throw InvalidProtocolBufferException.m24218b();
                                }
                                if ((i4 & 128) == 0) {
                                    break;
                                }
                                i2 += 7;
                            }
                        }
                    }
                }
                pwe pweVar = new pwe(new C2043k8(byteArrayInputStream, i, 0));
                AbstractC2155n8 abstractC2155n9 = (AbstractC2155n8) mo77051a(pweVar, buxVar);
                try {
                    pweVar.m71235a(0);
                    abstractC2155n8 = abstractC2155n9;
                } catch (InvalidProtocolBufferException e) {
                    e.f10912a = abstractC2155n9;
                    throw e;
                }
            }
            if (abstractC2155n8 == null || abstractC2155n8.isInitialized()) {
                return abstractC2155n8;
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.f10912a = abstractC2155n8;
            throw invalidProtocolBufferException;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }
}
