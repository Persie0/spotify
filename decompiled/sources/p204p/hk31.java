package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.tap.p163go.protocol.GoProtocolParseException;
import com.spotify.tap.p163go.socket.SocketIo$CommandParseException;
import com.spotify.tap.p163go.socket.SocketIo$ConnectionException;
import com.spotify.tap.p163go.socket.SocketIo$SocketIoException;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import io.reactivex.rxjava3.core.Observable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class hk31 {

    /* JADX INFO: renamed from: a */
    public final InputStream f92332a;

    /* JADX INFO: renamed from: b */
    public final dj10 f92333b;

    /* JADX INFO: renamed from: c */
    public final mqr f92334c;

    /* JADX INFO: renamed from: d */
    public final String f92335d;

    public hk31(InputStream inputStream, dj10 dj10Var, mqr mqrVar, String str) {
        this.f92332a = inputStream;
        this.f92333b = dj10Var;
        this.f92334c = mqrVar;
        this.f92335d = str;
    }

    /* JADX INFO: renamed from: a */
    public final qko0 m47730a(byte[] bArr) throws GoProtocolParseException {
        byte b;
        int i;
        byte[] bArrCopyOfRange;
        List list;
        boolean zEquals = Arrays.equals(bArr, dj10.f49526c);
        String str = this.f92335d;
        if (zEquals) {
            return new qko0("microsoft-surface-buds-legacy-client-id", "Surface Buds", "Microsoft", str);
        }
        Iterator it = this.f92333b.f49528b.iterator();
        while (it.hasNext()) {
            ((pko0) it.next()).getClass();
            if (bArr.length != 0 && (b = bArr[0]) == 1) {
                if (bArr.length == 0 || b != 1) {
                    throw new GoProtocolParseException(bArr, 4);
                }
                if (bArr.length < 2) {
                    bArrCopyOfRange = new byte[0];
                } else {
                    byte b2 = bArr[1];
                    if (b2 == 0) {
                        bArrCopyOfRange = new byte[0];
                    } else {
                        if (b2 <= 0 || bArr.length < (i = b2 + 2)) {
                            throw new GoProtocolParseException(bArr, 2);
                        }
                        bArrCopyOfRange = Arrays.copyOfRange(bArr, 2, i);
                    }
                }
                if (bArrCopyOfRange.length == 0) {
                    list = lau.f131415a;
                } else {
                    ArrayList arrayList = new ArrayList(3);
                    StringBuilder sb = new StringBuilder(bArrCopyOfRange.length);
                    for (byte b3 : bArrCopyOfRange) {
                        if (b3 == 0) {
                            arrayList.add(sb.toString());
                            sb.setLength(0);
                        } else {
                            sb.append((char) (b3 & 65535));
                        }
                    }
                    if (sb.length() > 0) {
                        throw new GoProtocolParseException(bArr, 3);
                    }
                    list = arrayList;
                }
                if (list.size() == 3) {
                    return new qko0((String) list.get(0), (String) list.get(1), (String) list.get(2), str);
                }
                throw new GoProtocolParseException(bArr, 5);
            }
        }
        throw new GoProtocolParseException(bArr, 1);
    }

    /* JADX INFO: renamed from: b */
    public final Observable m47731b() {
        return Observable.create(new b9v0(this, 28));
    }

    /* JADX INFO: renamed from: c */
    public final qko0 m47732c() {
        mqr mqrVar = this.f92334c;
        try {
            Logger.m3969e("Go: Do blocking read of bytes", new Object[0]);
            byte[] bArr = new byte[257];
            int i = this.f92332a.read(bArr, 0, 257);
            Logger.m3969e("Go: Bytes received", new Object[0]);
            if (i <= 0) {
                throw new SocketIo$SocketIoException() { // from class: com.spotify.tap.go.socket.SocketIo$CommandReadException
                };
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            qko0 qko0VarM47730a = m47730a(bArr2);
            String string = UUID.randomUUID().toString();
            String str = qko0VarM47730a.f189626a;
            String str2 = qko0VarM47730a.f189627b;
            String str3 = qko0VarM47730a.f189628c;
            String str4 = qko0VarM47730a.f189629d;
            qko0 qko0Var = new qko0(str, str2, str3, str4, string);
            mqr.m62582m(mqrVar, string, str, str3, str2, str4, "RECEIVED", null, null, 192);
            return qko0Var;
        } catch (GoProtocolParseException e) {
            String string2 = UUID.randomUUID().toString();
            mqr.m62582m(mqrVar, string2, null, null, null, this.f92335d, "RECEIVED", null, null, 192);
            mqr.m62582m(mqrVar, string2, null, null, null, this.f92335d, SearchEndpointResponseKt.RESULT_ERROR, "PARSE_ERROR", null, 128);
            mqrVar.m62591l(e.f6678a, 1);
            throw new SocketIo$CommandParseException("Error parsing bytes to command", e);
        } catch (IOException e2) {
            throw new SocketIo$ConnectionException("IO Exception. Socket likely closed", e2);
        }
    }
}
