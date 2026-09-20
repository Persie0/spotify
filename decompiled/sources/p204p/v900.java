package p204p;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Build;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class v900 implements jix {

    /* JADX INFO: renamed from: d */
    public static final abz f238809d = new abz(4);

    /* JADX INFO: renamed from: a */
    public final UUID f238810a;

    /* JADX INFO: renamed from: b */
    public final MediaDrm f238811b;

    /* JADX INFO: renamed from: c */
    public int f238812c;

    public v900(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = mva.f147546c;
        c95.m31844j(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f238810a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(mva.f147547d)) ? uuid : uuid2);
        this.f238811b = mediaDrm;
        this.f238812c = 1;
        if (mva.f147548e.equals(uuid)) {
            HashSet hashSet = dgd0.f48781a;
            if ("ASUS_Z00AD".equals(Build.MODEL)) {
                mediaDrm.setPropertyString("securityLevel", "L3");
            }
        }
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: a */
    public final Map mo53475a(byte[] bArr) {
        return this.f238811b.queryKeyStatus(bArr);
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: b */
    public final iix mo53476b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f238811b.getProvisionRequest();
        return new iix(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: c */
    public final byte[] mo53477c() {
        return this.f238811b.openSession();
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: e */
    public final void mo53478e(byte[] bArr, byte[] bArr2) {
        this.f238811b.restoreKeys(bArr, bArr2);
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: f */
    public final void mo53479f(byte[] bArr) throws DeniedByServerException {
        this.f238811b.provideProvisionResponse(bArr);
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: h */
    public final int mo53480h() {
        return 2;
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: i */
    public final lyl mo53481i(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f238810a;
        if (i < 27 && Objects.equals(uuid, mva.f147547d)) {
            uuid = mva.f147546c;
        }
        return new t900(uuid, bArr);
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: j */
    public final void mo53482j(byte[] bArr) {
        this.f238811b.closeSession(bArr);
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: k */
    public final void mo53483k(byte[] bArr, w9p0 w9p0Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                k04.m54897D(this.f238811b, bArr, w9p0Var);
            } catch (UnsupportedOperationException unused) {
                yif1.m93819w0("setLogSessionId failed.");
            }
        }
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: l */
    public final byte[] mo53484l(byte[] bArr, byte[] bArr2) {
        if (mva.f147547d.equals(this.f238810a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(h0b1.m46334v(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                yif1.m93810s("Failed to adjust response data: ".concat(h0b1.m46334v(bArr2)), e);
            }
        }
        return this.f238811b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0219  */
    /* JADX WARN: Code duplicated, block: B:123:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad A[LOOP:2: B:27:0x008e->B:35:0x00ad, LOOP_END] */
    @Override // p204p.jix
    /* JADX INFO: renamed from: m */
    public final gix mo53485m(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        zgs zgsVar;
        zgs zgsVar2;
        t0h1 t0h1VarM56592o;
        int i3;
        byte[] bArrM56593p;
        t0h1 t0h1VarM56592o2;
        UUID uuid = this.f238810a;
        zgs zgsVar3 = null;
        if (list != null) {
            boolean z = false;
            if (!mva.f147548e.equals(uuid)) {
                zgsVar = (zgs) list.get(0);
            } else if (Build.VERSION.SDK_INT < 28 || list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        zgsVar = (zgs) list.get(0);
                        break;
                    }
                    zgsVar2 = (zgs) list.get(i2);
                    byte[] bArr3 = zgsVar2.f282704e;
                    bArr3.getClass();
                    t0h1VarM56592o = kjg1.m56592o(bArr3);
                    if (t0h1VarM56592o == null) {
                        i3 = -1;
                    } else {
                        i3 = t0h1VarM56592o.f215889b;
                    }
                    if (i3 == 1) {
                        zgsVar = zgsVar2;
                        break;
                    }
                    i2++;
                }
            } else {
                zgs zgsVar4 = (zgs) list.get(0);
                int i4 = 0;
                int length = 0;
                while (true) {
                    if (i4 < list.size()) {
                        zgs zgsVar5 = (zgs) list.get(i4);
                        byte[] bArr4 = zgsVar5.f282704e;
                        bArr4.getClass();
                        if (Objects.equals(zgsVar5.f282703d, zgsVar4.f282703d) && Objects.equals(zgsVar5.f282702c, zgsVar4.f282702c) && kjg1.m56592o(bArr4) != null) {
                            length += bArr4.length;
                            i4++;
                        } else {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    zgsVar = (zgs) list.get(0);
                                    break;
                                }
                                zgsVar2 = (zgs) list.get(i2);
                                byte[] bArr5 = zgsVar2.f282704e;
                                bArr5.getClass();
                                t0h1VarM56592o = kjg1.m56592o(bArr5);
                                if (t0h1VarM56592o == null) {
                                    i3 = -1;
                                } else {
                                    i3 = t0h1VarM56592o.f215889b;
                                }
                                if (i3 == 1) {
                                    zgsVar = zgsVar2;
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i5 = 0;
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            byte[] bArr7 = ((zgs) list.get(i6)).f282704e;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i5, length2);
                            i5 += length2;
                        }
                        zgsVar = new zgs(zgsVar4.f282701b, zgsVar4.f282702c, zgsVar4.f282703d, bArr6);
                    }
                }
            }
            byte[] bArrM56586i = zgsVar.f282704e;
            bArrM56586i.getClass();
            UUID uuid2 = mva.f147549f;
            if (uuid2.equals(uuid)) {
                byte[] bArrM56593p2 = kjg1.m56593p(uuid, bArrM56586i);
                if (bArrM56593p2 != null) {
                    bArrM56586i = bArrM56593p2;
                }
                l2n0 l2n0Var = new l2n0(bArrM56586i);
                int iM57947s = l2n0Var.m57947s();
                short sM57949u = l2n0Var.m57949u();
                short sM57949u2 = l2n0Var.m57949u();
                if (sM57949u == 1 && sM57949u2 == 1) {
                    short sM57949u3 = l2n0Var.m57949u();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strM57915C = l2n0Var.m57915C(sM57949u3, charset);
                    if (!strM57915C.contains("<LA_URL>")) {
                        int iIndexOf = strM57915C.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            yif1.m93819w0("Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strM57915C.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strM57915C.substring(iIndexOf);
                        int i7 = iM57947s + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i7);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i7);
                        byteBufferAllocate.putShort(sM57949u);
                        byteBufferAllocate.putShort(sM57949u2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrM56586i = byteBufferAllocate.array();
                    }
                } else {
                    yif1.m93818w("Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrM56586i = kjg1.m56586i(uuid2, null, bArrM56586i);
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 27 && Objects.equals(uuid, mva.f147547d)) {
                z = true;
            }
            if (z && (t0h1VarM56592o2 = kjg1.m56592o(bArrM56586i)) != null) {
                bArrM56586i = kjg1.m56586i(mva.f147546c, (UUID[]) t0h1VarM56592o2.f215892e, (byte[]) t0h1VarM56592o2.f215891d);
            }
            HashSet hashSet = dgd0.f48781a;
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str3 = Build.MODEL;
                if (("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) && (bArrM56593p = kjg1.m56593p(uuid, bArrM56586i)) != null) {
                    bArrM56586i = bArrM56593p;
                }
            }
            String str4 = zgsVar.f282703d;
            str = (i8 < 26 && mva.f147547d.equals(uuid) && ("video/mp4".equals(str4) || "audio/mp4".equals(str4))) ? "cenc" : str4;
            bArr2 = bArrM56586i;
            zgsVar3 = zgsVar;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f238811b.getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (mva.f147547d.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = h0b1.m46334v(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
            String propertyString = this.f238811b.getPropertyString("version");
            if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && zgsVar3 != null) {
            String str5 = zgsVar3.f282702c;
            if (!TextUtils.isEmpty(str5)) {
                defaultUrl = str5;
            }
        }
        keyRequest.getRequestType();
        return new gix(defaultUrl, data);
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: n */
    public final void mo53486n(final xvo xvoVar) {
        this.f238811b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: p.u900
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                v900 v900Var = this.f228051a;
                xvo xvoVar2 = xvoVar;
                v900Var.getClass();
                un6 un6Var = ((lep) xvoVar2.f266440b).f132652y;
                un6Var.getClass();
                un6Var.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // p204p.jix
    /* JADX INFO: renamed from: o */
    public final boolean mo53487o(String str, byte[] bArr) throws Throwable {
        boolean zEquals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f238810a;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(mva.f147548e);
            MediaDrm mediaDrm = this.f238811b;
            if (!zEquals2) {
                zEquals = uuid.equals(mva.f147547d);
            } else if (i >= 37) {
                zEquals = true;
            } else {
                String propertyString = mediaDrm.getPropertyString("version");
                if (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) {
                    zEquals = false;
                } else {
                    zEquals = true;
                }
            }
            if (zEquals) {
                return k04.m54894A(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto((i >= 27 || !Objects.equals(uuid, mva.f147547d)) ? uuid : mva.f147546c, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z = !uuid.equals(mva.f147547d);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused2) {
        }
    }

    @Override // p204p.jix
    public final synchronized void release() {
        int i = this.f238812c - 1;
        this.f238812c = i;
        if (i == 0) {
            this.f238811b.release();
        }
    }
}
