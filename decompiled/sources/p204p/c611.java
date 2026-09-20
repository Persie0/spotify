package p204p;

import com.spotify.share.linkgeneration.api.proto.CustomData;
import com.spotify.share.linkgeneration.api.proto.GenerateUrlRequest;
import com.spotify.share.linkgeneration.api.proto.GenerateUrlResponse;
import com.spotify.share.linkgeneration.api.proto.LinkPreview;
import com.spotify.share.linkgeneration.api.proto.UtmParameters;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class c611 implements d611 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34334a;

    /* JADX INFO: renamed from: b */
    public final Object f34335b;

    public /* synthetic */ c611(Object obj, int i) {
        this.f34334a = i;
        this.f34335b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    @Override // p204p.d611
    /* JADX INFO: renamed from: a */
    public final Object mo31502a(i611 i611Var, ibk ibkVar) {
        b611 b611Var;
        switch (this.f34334a) {
            case 0:
                if (ibkVar instanceof b611) {
                    b611Var = (b611) ibkVar;
                    int i = b611Var.f23801c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        b611Var.f23801c = i - Integer.MIN_VALUE;
                    } else {
                        b611Var = new b611(this, ibkVar);
                    }
                } else {
                    b611Var = new b611(this, ibkVar);
                }
                Object objM70183a = b611Var.f23799a;
                int i2 = b611Var.f23801c;
                if (i2 == 0) {
                    bga.m29073P(objM70183a);
                    String str = i611Var.f99069a;
                    String str2 = i611Var.f99070b;
                    j1b1 j1b1Var = i611Var.f99071c;
                    Map map = i611Var.f99072d;
                    String str3 = i611Var.f99073e;
                    im80 im80Var = i611Var.f99074f;
                    z010 z010VarM21018s = GenerateUrlRequest.m21018s();
                    z010VarM21018s.m95005r(str);
                    if (j1b1Var != null) {
                        i1b1 i1b1VarM21061s = UtmParameters.m21061s();
                        String str4 = j1b1Var.f107715a;
                        if (str4 != null) {
                            i1b1VarM21061s.m49402m(str4);
                        }
                        String str5 = j1b1Var.f107716b;
                        if (str5 != null) {
                            i1b1VarM21061s.m49405s(str5);
                        }
                        String str6 = j1b1Var.f107717c;
                        if (str6 != null) {
                            i1b1VarM21061s.m49404r(str6);
                        }
                        String str7 = j1b1Var.f107718d;
                        if (str7 != null) {
                            i1b1VarM21061s.m49406t(str7);
                        }
                        String str8 = j1b1Var.f107719e;
                        if (str8 != null) {
                            i1b1VarM21061s.m49403q(str8);
                        }
                        z010VarM21018s.m95006s((UtmParameters) i1b1VarM21061s.build());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (str2 != null) {
                        linkedHashMap.put("context", str2);
                    }
                    if (map != null) {
                        linkedHashMap.putAll(map);
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str9 = (String) entry.getKey();
                        String str10 = (String) entry.getValue();
                        y9m y9mVarM21012p = CustomData.m21012p();
                        y9mVarM21012p.m93155m(str9);
                        y9mVarM21012p.m93156q(str10);
                        z010VarM21018s.m95003m((CustomData) y9mVarM21012p.build());
                    }
                    if (str3 == null) {
                        str3 = "unknown";
                    }
                    y9m y9mVarM21012p2 = CustomData.m21012p();
                    y9mVarM21012p2.m93155m("app_destination");
                    y9mVarM21012p2.m93156q(str3);
                    z010VarM21018s.m95003m((CustomData) y9mVarM21012p2.build());
                    if (im80Var != null) {
                        hm80 hm80VarM21024p = LinkPreview.m21024p();
                        String str11 = im80Var.f103640a;
                        if (str11 != null) {
                            hm80VarM21024p.m47934q(str11);
                        }
                        String str12 = im80Var.f103641b;
                        if (str12 != null) {
                            hm80VarM21024p.m47933m(str12);
                        }
                        z010VarM21018s.m95004q((LinkPreview) hm80VarM21024p.build());
                    }
                    GenerateUrlRequest generateUrlRequest = (GenerateUrlRequest) z010VarM21018s.build();
                    pka1 pka1Var = (pka1) this.f34335b;
                    b611Var.f23801c = 1;
                    objM70183a = pka1Var.m70183a(generateUrlRequest, b611Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM70183a == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM70183a);
                }
                GenerateUrlResponse generateUrlResponse = (GenerateUrlResponse) objM70183a;
                return new a611(generateUrlResponse.m21020o(), generateUrlResponse.getShareId(), generateUrlResponse.m21021p(), generateUrlResponse.m21019n());
            default:
                pqm0 pqm0VarM39924b = ((et01) this.f34335b).m39924b(i611Var.f99069a, i611Var.f99070b, i611Var.f99071c, i611Var.f99072d);
                String str13 = (String) pqm0VarM39924b.f180350a;
                return new a611(str13, (String) pqm0VarM39924b.f180351b, i611Var.f99069a, str13);
        }
    }
}
