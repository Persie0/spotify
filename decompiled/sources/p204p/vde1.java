package p204p;

import android.graphics.Color;
import com.spotify.wrapped.p194v1.proto.ConsumerShareMessaging;
import com.spotify.wrapped.p194v1.proto.RiveAnimationInput;
import com.spotify.wrapped.p194v1.proto.RiveFont;
import com.spotify.wrapped.p194v1.proto.ShareAssetResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class vde1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ vde1 f240402a = new vde1();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m85224a(ae50 ae50Var, z4l0 z4l0Var, luk lukVar, ibk ibkVar) {
        tde1 tde1Var;
        ae50<RiveAnimationInput> ae50Var2;
        aix0 yhx0Var;
        if (ibkVar instanceof tde1) {
            tde1Var = (tde1) ibkVar;
            int i = tde1Var.f219300d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tde1Var.f219300d = i - Integer.MIN_VALUE;
            } else {
                tde1Var = new tde1(this, ibkVar);
            }
        } else {
            tde1Var = new tde1(this, ibkVar);
        }
        Object objM56684z = tde1Var.f219298b;
        int i2 = tde1Var.f219300d;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM56684z);
            tde1Var.f219297a = ae50Var;
            tde1Var.f219300d = 1;
            objM56684z = kk40.m56684z(new qt81(ae50Var, lukVar, z4l0Var, fbkVar, 21), tde1Var);
            yuk yukVar = yuk.f276404a;
            if (objM56684z == yukVar) {
                return yukVar;
            }
            ae50Var2 = ae50Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ae50Var2 = tde1Var.f219297a;
            bga.m29073P(objM56684z);
        }
        Map map = (Map) objM56684z;
        ArrayList arrayList = new ArrayList();
        for (RiveAnimationInput riveAnimationInput : ae50Var2) {
            String path = riveAnimationInput.getPath();
            int iM23213q = riveAnimationInput.m23209n().m23213q();
            switch (iM23213q == 0 ? -1 : sde1.f208006b[edb.m38547C(iM23213q)]) {
                case -1:
                case 8:
                    yhx0Var = null;
                    if (yhx0Var != null) {
                        arrayList.add(yhx0Var);
                    }
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    wj50.m88279p(path);
                    yhx0Var = new yhx0(path, riveAnimationInput.m23209n().getStringValue());
                    if (yhx0Var != null) {
                        arrayList.add(yhx0Var);
                    }
                    break;
                case 2:
                    wj50.m88279p(path);
                    yhx0Var = new thx0(path, riveAnimationInput.m23209n().getBoolValue());
                    if (yhx0Var != null) {
                        arrayList.add(yhx0Var);
                    }
                    break;
                case 3:
                    wj50.m88279p(path);
                    yhx0Var = new xhx0(path, riveAnimationInput.m23209n().m23214r());
                    if (yhx0Var != null) {
                        arrayList.add(yhx0Var);
                    }
                    break;
                case 4:
                    wj50.m88279p(path);
                    yhx0Var = new zhx0(path);
                    if (yhx0Var != null) {
                        arrayList.add(yhx0Var);
                    }
                    break;
                case 5:
                    wj50.m88279p(path);
                    yhx0Var = new uhx0(path, Color.parseColor(riveAnimationInput.m23209n().m23211n()));
                    if (yhx0Var != null) {
                        arrayList.add(yhx0Var);
                    }
                    break;
                case 6:
                    wj50.m88279p(path);
                    yhx0Var = new vhx0(path, riveAnimationInput.m23209n().m23212p());
                    if (yhx0Var != null) {
                        arrayList.add(yhx0Var);
                    }
                    break;
                case 7:
                    byte[] bArr = (byte[]) map.get(path);
                    if (bArr != null) {
                        wj50.m88279p(path);
                        yhx0Var = new whx0(path, bArr);
                    } else {
                        yhx0Var = null;
                    }
                    if (yhx0Var != null) {
                        arrayList.add(yhx0Var);
                    }
                    break;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m85225b(ShareAssetResponse shareAssetResponse, z4l0 z4l0Var, luk lukVar, ibk ibkVar) {
        ude1 ude1Var;
        yde1 wde1Var;
        ShareAssetResponse shareAssetResponse2;
        String str;
        if (ibkVar instanceof ude1) {
            ude1Var = (ude1) ibkVar;
            int i = ude1Var.f229241e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ude1Var.f229241e = i - Integer.MIN_VALUE;
            } else {
                ude1Var = new ude1(this, ibkVar);
            }
        } else {
            ude1Var = new ude1(this, ibkVar);
        }
        Object obj = ude1Var.f229239c;
        int i2 = ude1Var.f229241e;
        if (i2 == 0) {
            bga.m29073P(obj);
            int iM23216n = shareAssetResponse.m23220o().m23216n();
            int i3 = iM23216n == 0 ? -1 : sde1.f208005a[edb.m38547C(iM23216n)];
            if (i3 != -1) {
                if (i3 == 1) {
                    wde1Var = new wde1(shareAssetResponse.m23220o().getImageUrl());
                } else if (i3 == 2) {
                    String url = shareAssetResponse.m23220o().m23217p().getUrl();
                    ae50 ae50VarM23208p = shareAssetResponse.m23220o().m23217p().m23208p();
                    ude1Var.f229237a = shareAssetResponse;
                    ude1Var.f229238b = url;
                    ude1Var.f229241e = 1;
                    Serializable serializableM85224a = m85224a(ae50VarM23208p, z4l0Var, lukVar, ude1Var);
                    Serializable serializable = yuk.f276404a;
                    if (serializableM85224a == serializable) {
                        return serializable;
                    }
                    shareAssetResponse2 = shareAssetResponse;
                    str = url;
                    obj = serializableM85224a;
                } else if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                yde1 yde1Var = wde1Var;
                String strM23223r = shareAssetResponse.m23223r();
                ConsumerShareMessaging consumerShareMessagingM23222q = shareAssetResponse.m23222q();
                return new dee1(strM23223r, new cee1(consumerShareMessagingM23222q.m23137o(), consumerShareMessagingM23222q.m23139q(), consumerShareMessagingM23222q.m23138p()), shareAssetResponse.m23219n(), new zde1(shareAssetResponse.m23221p().m23226p(), shareAssetResponse.m23221p().m23225o()), yde1Var);
            }
            throw new IllegalStateException(("asset is empty for " + shareAssetResponse.m23223r()).toString());
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = ude1Var.f229238b;
        shareAssetResponse2 = ude1Var.f229237a;
        bga.m29073P(obj);
        List list = (List) obj;
        ae50 ae50VarM23207o = shareAssetResponse2.m23220o().m23217p().m23207o();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM23207o, 10));
        Iterator<E> it = ae50VarM23207o.iterator();
        while (it.hasNext()) {
            arrayList.add(((RiveFont) it.next()).getName());
        }
        wde1Var = new xde1(str, arrayList, list);
        shareAssetResponse = shareAssetResponse2;
        yde1 yde1Var2 = wde1Var;
        String strM23223r2 = shareAssetResponse.m23223r();
        ConsumerShareMessaging consumerShareMessagingM23222q2 = shareAssetResponse.m23222q();
        return new dee1(strM23223r2, new cee1(consumerShareMessagingM23222q2.m23137o(), consumerShareMessagingM23222q2.m23139q(), consumerShareMessagingM23222q2.m23138p()), shareAssetResponse.m23219n(), new zde1(shareAssetResponse.m23221p().m23226p(), shareAssetResponse.m23221p().m23225o()), yde1Var2);
    }
}
