package p204p;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class ix71 extends cy8 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f106615i;

    public /* synthetic */ ix71(int i) {
        this.f106615i = i;
    }

    /* JADX INFO: renamed from: m */
    public static void m51860m(ByteBuffer byteBuffer, int i) {
        float f = (float) (((double) i) * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f) ? 0 : Float.floatToIntBits(f));
    }

    @Override // p204p.cy8
    /* JADX INFO: renamed from: a */
    public final q27 mo34344a(q27 q27Var) throws AudioProcessor$UnhandledAudioFormatException {
        switch (this.f106615i) {
            case 0:
                int i = q27Var.f184528c;
                if (h0b1.m46288P(i)) {
                    return i != 4 ? new q27(q27Var.f184526a, q27Var.f184527b, 4) : q27.f184525e;
                }
                throw new AudioProcessor$UnhandledAudioFormatException(q27Var);
            default:
                int i2 = q27Var.f184528c;
                if (h0b1.m46288P(i2)) {
                    return i2 != 2 ? new q27(q27Var.f184526a, q27Var.f184527b, 2) : q27.f184525e;
                }
                throw new AudioProcessor$UnhandledAudioFormatException(q27Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    @Override // p204p.t27
    /* JADX INFO: renamed from: h */
    public final void mo31670h(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM34348l;
        switch (this.f106615i) {
            case 0:
                int iPosition = byteBuffer.position();
                int iLimit = byteBuffer.limit();
                int i = iLimit - iPosition;
                int i2 = this.f43179b.f184528c;
                if (i2 == 2) {
                    byteBufferM34348l = m34348l(i * 2);
                    while (iPosition < iLimit) {
                        m51860m(byteBufferM34348l, byteBuffer.getShort(iPosition) << 16);
                        iPosition += 2;
                    }
                } else if (i2 == 3) {
                    byteBufferM34348l = m34348l(i * 4);
                    while (iPosition < iLimit) {
                        m51860m(byteBufferM34348l, ((byteBuffer.get(iPosition) & 255) - 128) << 24);
                        iPosition++;
                    }
                } else if (i2 == 21) {
                    byteBufferM34348l = m34348l((i / 3) * 4);
                    while (iPosition < iLimit) {
                        m51860m(byteBufferM34348l, k0e1.m55000v(byteBuffer.get(iPosition + 2), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition), (byte) 0));
                        iPosition += 3;
                    }
                } else if (i2 == 22) {
                    byteBufferM34348l = m34348l(i);
                    while (iPosition < iLimit) {
                        m51860m(byteBufferM34348l, byteBuffer.getInt(iPosition));
                        iPosition += 4;
                    }
                } else if (i2 == 268435456) {
                    byteBufferM34348l = m34348l(i * 2);
                    while (iPosition < iLimit) {
                        m51860m(byteBufferM34348l, Short.reverseBytes(byteBuffer.getShort(iPosition)) << 16);
                        iPosition += 2;
                    }
                } else if (i2 == 1342177280) {
                    byteBufferM34348l = m34348l((i / 3) * 4);
                    while (iPosition < iLimit) {
                        m51860m(byteBufferM34348l, k0e1.m55000v(byteBuffer.get(iPosition), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition + 2), (byte) 0));
                        iPosition += 3;
                    }
                } else if (i2 == 1610612736) {
                    byteBufferM34348l = m34348l(i);
                    while (iPosition < iLimit) {
                        m51860m(byteBufferM34348l, Integer.reverseBytes(byteBuffer.getInt(iPosition)));
                        iPosition += 4;
                    }
                } else if (i2 == 1879048192) {
                    byteBufferM34348l = m34348l(i / 2);
                    while (iPosition < iLimit) {
                        byteBufferM34348l.putFloat((float) byteBuffer.getDouble(iPosition));
                        iPosition += 8;
                    }
                } else if (i2 == 1895825408) {
                    byteBufferM34348l = m34348l(i);
                    while (iPosition < iLimit) {
                        byteBufferM34348l.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition))));
                        iPosition += 4;
                    }
                } else {
                    if (i2 != 1912602624) {
                        throw new IllegalStateException();
                    }
                    byteBufferM34348l = m34348l(i / 2);
                    while (iPosition < iLimit) {
                        byteBufferM34348l.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition))));
                        iPosition += 8;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                byteBufferM34348l.flip();
                return;
            default:
                int iPosition2 = byteBuffer.position();
                int iLimit2 = byteBuffer.limit();
                int i3 = iLimit2 - iPosition2;
                int i4 = this.f43179b.f184528c;
                if (i4 == 3) {
                    i3 *= 2;
                } else if (i4 == 4) {
                    i3 /= 2;
                } else {
                    if (i4 != 21) {
                        if (i4 == 22) {
                            i3 /= 2;
                        } else if (i4 != 268435456) {
                            if (i4 != 1342177280) {
                                if (i4 == 1610612736) {
                                    i3 /= 2;
                                } else {
                                    if (i4 != 1879048192) {
                                        if (i4 == 1895825408) {
                                            i3 /= 2;
                                        } else if (i4 != 1912602624) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    i3 /= 4;
                                }
                            }
                        }
                    }
                    i3 /= 3;
                    i3 *= 2;
                }
                ByteBuffer byteBufferM34348l2 = m34348l(i3);
                int i5 = this.f43179b.f184528c;
                if (i5 == 3) {
                    while (iPosition2 < iLimit2) {
                        byteBufferM34348l2.put((byte) 0);
                        byteBufferM34348l2.put((byte) ((byteBuffer.get(iPosition2) & 255) - 128));
                        iPosition2++;
                    }
                } else if (i5 == 4) {
                    while (iPosition2 < iLimit2) {
                        short sM46315i = (short) (h0b1.m46315i(byteBuffer.getFloat(iPosition2), -1.0f, 1.0f) * 32767.0f);
                        byteBufferM34348l2.put((byte) (sM46315i & 255));
                        byteBufferM34348l2.put((byte) ((sM46315i >> 8) & 255));
                        iPosition2 += 4;
                    }
                } else if (i5 == 21) {
                    while (iPosition2 < iLimit2) {
                        byteBufferM34348l2.put(byteBuffer.get(iPosition2 + 1));
                        byteBufferM34348l2.put(byteBuffer.get(iPosition2 + 2));
                        iPosition2 += 3;
                    }
                } else if (i5 == 22) {
                    while (iPosition2 < iLimit2) {
                        byteBufferM34348l2.put(byteBuffer.get(iPosition2 + 2));
                        byteBufferM34348l2.put(byteBuffer.get(iPosition2 + 3));
                        iPosition2 += 4;
                    }
                } else if (i5 == 268435456) {
                    while (iPosition2 < iLimit2) {
                        byteBufferM34348l2.put(byteBuffer.get(iPosition2 + 1));
                        byteBufferM34348l2.put(byteBuffer.get(iPosition2));
                        iPosition2 += 2;
                    }
                } else if (i5 == 1342177280) {
                    while (iPosition2 < iLimit2) {
                        byteBufferM34348l2.put(byteBuffer.get(iPosition2 + 1));
                        byteBufferM34348l2.put(byteBuffer.get(iPosition2));
                        iPosition2 += 3;
                    }
                } else if (i5 == 1610612736) {
                    while (iPosition2 < iLimit2) {
                        byteBufferM34348l2.put(byteBuffer.get(iPosition2 + 1));
                        byteBufferM34348l2.put(byteBuffer.get(iPosition2));
                        iPosition2 += 4;
                    }
                } else if (i5 == 1879048192) {
                    while (iPosition2 < iLimit2) {
                        short sMax = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(iPosition2), 1.0d)) * 32767.0d);
                        byteBufferM34348l2.put((byte) (sMax & 255));
                        byteBufferM34348l2.put((byte) ((sMax >> 8) & 255));
                        iPosition2 += 8;
                    }
                } else if (i5 == 1895825408) {
                    while (iPosition2 < iLimit2) {
                        short sM46315i2 = (short) (h0b1.m46315i(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition2))), -1.0f, 1.0f) * 32767.0f);
                        byteBufferM34348l2.put((byte) (sM46315i2 & 255));
                        byteBufferM34348l2.put((byte) ((sM46315i2 >> 8) & 255));
                        iPosition2 += 4;
                    }
                } else {
                    if (i5 != 1912602624) {
                        throw new IllegalStateException();
                    }
                    while (iPosition2 < iLimit2) {
                        short sMax2 = (short) (Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition2))), 1.0d)) * 32767.0d);
                        byteBufferM34348l2.put((byte) (sMax2 & 255));
                        byteBufferM34348l2.put((byte) ((sMax2 >> 8) & 255));
                        iPosition2 += 8;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                byteBufferM34348l2.flip();
                return;
        }
    }
}
