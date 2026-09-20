package p204p;

import com.google.protobuf.Duration;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.speechlessupload.proto.p157v1.FilePart;
import com.spotify.speechlessupload.proto.p157v1.FileUpload;
import com.spotify.speechlessupload.proto.p157v1.FileUploadUrls;
import com.spotify.speechlessupload.proto.p157v1.ImageMedia;
import com.spotify.speechlessupload.proto.p157v1.InitiateUploadRequest;
import com.spotify.speechlessupload.proto.p157v1.InitiateUploadResponse;
import com.spotify.speechlessupload.proto.p157v1.MediaFile;
import com.spotify.speechlessupload.proto.p157v1.MediaResource;
import com.spotify.speechlessupload.proto.p157v1.SubmitChatMediaUploadRequest;
import com.spotify.speechlessupload.proto.p157v1.SubmitChatMediaUploadResponse;
import com.spotify.speechlessupload.proto.p157v1.VideoMedia;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes5.dex */
public final class tyd0 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final uyd0 f224925a;

    /* JADX INFO: renamed from: b */
    public final my81 f224926b;

    /* JADX INFO: renamed from: c */
    public final trz f224927c;

    /* JADX INFO: renamed from: d */
    public final luk f224928d;

    /* JADX INFO: renamed from: e */
    public final am71 f224929e;

    /* JADX INFO: renamed from: f */
    public final ynb f224930f;

    /* JADX INFO: renamed from: g */
    public final z4l0 f224931g;

    /* JADX INFO: renamed from: h */
    public final wg61 f224932h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f224933i;

    /* JADX INFO: renamed from: t */
    public final c9k f224934t;

    public tyd0(uyd0 uyd0Var, my81 my81Var, z4l0 z4l0Var, trz trzVar, luk lukVar, am71 am71Var, ynb ynbVar) {
        this.f224925a = uyd0Var;
        this.f224926b = my81Var;
        this.f224927c = trzVar;
        this.f224928d = lukVar;
        this.f224929e = am71Var;
        this.f224930f = ynbVar;
        y4l0 y4l0VarM95347a = z4l0Var.m95347a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        y4l0VarM95347a.m92815b(30L, timeUnit);
        y4l0VarM95347a.m92817d(30L, timeUnit);
        this.f224931g = new z4l0(y4l0VarM95347a);
        this.f224932h = new wg61(new uqd0(this, 2));
        this.f224933i = new ConcurrentHashMap();
        this.f224934t = p3n0.m69075f(lukVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public static final ArrayList m81957a(tyd0 tyd0Var, List list, List list2, long j) {
        ?? SingletonList;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fyd0 fyd0Var = (fyd0) list.get(i);
            boolean z = ((sfd0) list2.get(i)).f208534c instanceof xfd0;
            long length = new File(fyd0Var.f74703a).length();
            if (!z || j <= 0 || length <= j) {
                SingletonList = Collections.singletonList(Integer.valueOf((int) length));
            } else {
                SingletonList = new ArrayList();
                while (length > 0) {
                    SingletonList.add(Integer.valueOf((int) Math.min(length, j)));
                    length -= j;
                }
            }
            arrayList.add(SingletonList);
            String str = fyd0Var.f74706d;
            if (str != null) {
                arrayList.add(Collections.singletonList(Integer.valueOf((int) new File(str).length())));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Serializable m81958b(tyd0 tyd0Var, String str, ArrayList arrayList, ibk ibkVar) {
        jyd0 jyd0Var;
        if (ibkVar instanceof jyd0) {
            jyd0Var = (jyd0) ibkVar;
            int i = jyd0Var.f117383c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jyd0Var.f117383c = i - Integer.MIN_VALUE;
            } else {
                jyd0Var = new jyd0(tyd0Var, ibkVar);
            }
        } else {
            jyd0Var = new jyd0(tyd0Var, ibkVar);
        }
        Object objM84196c = jyd0Var.f117381a;
        int i2 = jyd0Var.f117383c;
        if (i2 == 0) {
            bga.m29073P(objM84196c);
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    mwy mwyVarM21495o = FilePart.m21495o();
                    mwyVarM21495o.m63072m(iIntValue);
                    arrayList3.add((FilePart) mwyVarM21495o.build());
                }
                hxy hxyVarM21497o = FileUpload.m21497o();
                hxyVarM21497o.m49058m(arrayList3);
                arrayList2.add((FileUpload) hxyVarM21497o.build());
            }
            String strM61968d = mjd.m61968d(6, str, null);
            uyd0 uyd0Var = tyd0Var.f224925a;
            dr40 dr40VarM21508p = InitiateUploadRequest.m21508p();
            dr40VarM21508p.m36705q(strM61968d);
            dr40VarM21508p.m36704m(arrayList2);
            InitiateUploadRequest initiateUploadRequest = (InitiateUploadRequest) dr40VarM21508p.build();
            jyd0Var.f117383c = 1;
            objM84196c = uyd0Var.m84196c(initiateUploadRequest, jyd0Var);
            yuk yukVar = yuk.f276404a;
            if (objM84196c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM84196c);
        }
        ae50 ae50VarM21509n = ((InitiateUploadResponse) objM84196c).m21509n();
        ArrayList arrayList4 = new ArrayList(i6f.m49804T(ae50VarM21509n, 10));
        Iterator<E> it3 = ae50VarM21509n.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((FileUploadUrls) it3.next()).m21498n());
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0381  */
    /* JADX WARN: Code duplicated, block: B:174:0x0384  */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.String, java.util.ArrayList, p.eyd0, p.yyd0] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.String, java.util.ArrayList, p.eyd0, p.yyd0] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX INFO: renamed from: c */
    public static final Object m81959c(tyd0 tyd0Var, String str, String str2, eyd0 eyd0Var, yyd0 yyd0Var, ibk ibkVar) {
        oyd0 oyd0Var;
        ArrayList arrayList;
        int i;
        w2a1 w2a1Var;
        Object obj;
        boolean z;
        Object obj2;
        yyd0 yyd0Var2;
        ArrayList arrayList2;
        Object obj3;
        Object obj4;
        Object obj5;
        MediaResource mediaResource;
        MediaFile mediaFile;
        String str3;
        ?? r1;
        String str4;
        ?? r2;
        String str5;
        boolean z2;
        String str6 = str;
        String str7 = str2;
        eyd0 eyd0Var2 = eyd0Var;
        yyd0 yyd0Var3 = yyd0Var;
        if (ibkVar instanceof oyd0) {
            oyd0Var = (oyd0) ibkVar;
            int i2 = oyd0Var.f171753h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oyd0Var.f171753h = i2 - Integer.MIN_VALUE;
            } else {
                oyd0Var = new oyd0(tyd0Var, ibkVar);
            }
        } else {
            oyd0Var = new oyd0(tyd0Var, ibkVar);
        }
        oyd0 oyd0Var2 = oyd0Var;
        Object objM84194a = oyd0Var2.f171751f;
        int i3 = oyd0Var2.f171753h;
        w2a1 w2a1Var2 = w2a1.f247311a;
        boolean z3 = true;
        Object obj6 = null;
        Object obj7 = yuk.f276404a;
        try {
            try {
                try {
                    try {
                        if (i3 != 0) {
                            if (i3 == 1) {
                                ArrayList arrayList3 = oyd0Var2.f171750e;
                                yyd0 yyd0Var4 = oyd0Var2.f171749d;
                                eyd0Var2 = oyd0Var2.f171748c;
                                str7 = oyd0Var2.f171747b;
                                String str8 = oyd0Var2.f171746a;
                                try {
                                    bga.m29073P(objM84194a);
                                    yyd0Var2 = yyd0Var4;
                                    str7 = str7;
                                    arrayList2 = arrayList3;
                                    str6 = str8;
                                    w2a1Var = w2a1Var2;
                                    obj = obj7;
                                } catch (IOException unused) {
                                    yyd0Var = yyd0Var4;
                                    str4 = str8;
                                    w2a1Var = w2a1Var2;
                                    r2 = 0;
                                    obj = obj7;
                                    arrayList = arrayList3;
                                    oyd0Var2.f171746a = r2;
                                    oyd0Var2.f171747b = r2;
                                    oyd0Var2.f171748c = r2;
                                    oyd0Var2.f171749d = r2;
                                    oyd0Var2.f171750e = r2;
                                    oyd0Var2.f171753h = 2;
                                    if (tyd0Var.m81969k(true, str4, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                        return obj;
                                    }
                                } catch (HttpException e) {
                                    e = e;
                                    yyd0Var = yyd0Var4;
                                    str5 = str8;
                                    w2a1Var = w2a1Var2;
                                    z = true;
                                    obj = obj7;
                                    arrayList = arrayList3;
                                    if (e.f288164a == 400) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    oyd0Var2.f171746a = null;
                                    oyd0Var2.f171747b = null;
                                    oyd0Var2.f171748c = null;
                                    oyd0Var2.f171749d = null;
                                    oyd0Var2.f171750e = null;
                                    oyd0Var2.f171753h = 3;
                                    if (tyd0Var.m81969k(z2, str5, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                        return obj;
                                    }
                                } catch (Exception unused2) {
                                    yyd0Var = yyd0Var4;
                                    str3 = str8;
                                    w2a1Var = w2a1Var2;
                                    r1 = 0;
                                    obj = obj7;
                                    arrayList = arrayList3;
                                    oyd0Var2.f171746a = r1;
                                    oyd0Var2.f171747b = r1;
                                    oyd0Var2.f171748c = r1;
                                    oyd0Var2.f171749d = r1;
                                    oyd0Var2.f171750e = r1;
                                    oyd0Var2.f171753h = 4;
                                    if (tyd0Var.m81969k(false, str3, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                        return obj;
                                    }
                                }
                            } else {
                                if (i3 != 2 && i3 != 3 && i3 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bga.m29073P(objM84194a);
                                w2a1Var = w2a1Var2;
                            }
                            return w2a1Var;
                        }
                        bga.m29073P(objM84194a);
                        List list = (List) ((Map) eyd0Var2.f64054b.getValue()).get(str7);
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (Object obj8 : list) {
                                if (((zfd0) obj8).f282286c) {
                                    arrayList.add(obj8);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList == null || arrayList.isEmpty()) {
                            i = 4;
                        } else {
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (!(((zfd0) it.next()).f282285b instanceof hga1)) {
                                        i = 4;
                                    }
                                }
                            }
                            String str9 = yyd0Var3.f277479g;
                            sr4 sr4Var = yyd0Var3.f277481i;
                            if (sr4Var != null) {
                                sr4Var.m79019k(str9, null, (4 & 4) != 0);
                            }
                            yyd0Var3.f277482j = str9;
                            try {
                                try {
                                    String strM61968d = mjd.m61968d(6, str6, null);
                                    try {
                                        uyd0 uyd0Var = tyd0Var.f224925a;
                                        es51 es51VarM21521p = SubmitChatMediaUploadRequest.m21521p();
                                        es51VarM21521p.m39887q(strM61968d);
                                        ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList, 10));
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            try {
                                                try {
                                                    try {
                                                        zfd0 zfd0Var = (zfd0) it2.next();
                                                        try {
                                                            hga1 hga1Var = (hga1) zfd0Var.f282285b;
                                                            String str10 = hga1Var.f91106d;
                                                            int i4 = hga1Var.f91105c;
                                                            Iterator it3 = it2;
                                                            int i5 = hga1Var.f91104b;
                                                            w2a1Var = w2a1Var2;
                                                            try {
                                                                List list2 = hga1Var.f91103a;
                                                                obj5 = obj7;
                                                                try {
                                                                    bga1 bga1VarM49004q = hxg1.m49004q(hga1Var.f91109g);
                                                                    if (str10 != null) {
                                                                        try {
                                                                            fld0 fld0VarM21518s = MediaResource.m21518s();
                                                                            fld0VarM21518s.m41997s(str10);
                                                                            fld0VarM21518s.m41998t(hga1Var.f91107e);
                                                                            fld0VarM21518s.m41995q(hga1Var.f91108f);
                                                                            fld0VarM21518s.m41996r(bga1VarM49004q);
                                                                            mediaResource = (MediaResource) fld0VarM21518s.build();
                                                                        } catch (IOException unused3) {
                                                                            yyd0Var = yyd0Var3;
                                                                            obj = obj5;
                                                                            obj2 = null;
                                                                            str7 = str7;
                                                                            obj4 = obj2;
                                                                            str4 = str6;
                                                                            r2 = obj4;
                                                                            oyd0Var2.f171746a = r2;
                                                                            oyd0Var2.f171747b = r2;
                                                                            oyd0Var2.f171748c = r2;
                                                                            oyd0Var2.f171749d = r2;
                                                                            oyd0Var2.f171750e = r2;
                                                                            oyd0Var2.f171753h = 2;
                                                                            if (tyd0Var.m81969k(true, str4, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                                return obj;
                                                                            }
                                                                            return w2a1Var;
                                                                        } catch (HttpException e2) {
                                                                            e = e2;
                                                                            yyd0Var = yyd0Var3;
                                                                            obj = obj5;
                                                                            z = true;
                                                                            str7 = str7;
                                                                            str5 = str6;
                                                                            if (e.f288164a == 400) {
                                                                                z2 = z;
                                                                            } else {
                                                                                z2 = false;
                                                                            }
                                                                            oyd0Var2.f171746a = null;
                                                                            oyd0Var2.f171747b = null;
                                                                            oyd0Var2.f171748c = null;
                                                                            oyd0Var2.f171749d = null;
                                                                            oyd0Var2.f171750e = null;
                                                                            oyd0Var2.f171753h = 3;
                                                                            if (tyd0Var.m81969k(z2, str5, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                                return obj;
                                                                            }
                                                                            return w2a1Var;
                                                                        } catch (Exception unused4) {
                                                                            yyd0Var = yyd0Var3;
                                                                            obj = obj5;
                                                                            obj3 = null;
                                                                            str7 = str7;
                                                                            str3 = str6;
                                                                            r1 = obj3;
                                                                            oyd0Var2.f171746a = r1;
                                                                            oyd0Var2.f171747b = r1;
                                                                            oyd0Var2.f171748c = r1;
                                                                            oyd0Var2.f171749d = r1;
                                                                            oyd0Var2.f171750e = r1;
                                                                            oyd0Var2.f171753h = 4;
                                                                            if (tyd0Var.m81969k(false, str3, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                                return obj;
                                                                            }
                                                                            return w2a1Var;
                                                                        }
                                                                    } else {
                                                                        fld0 fld0VarM21518s2 = MediaResource.m21518s();
                                                                        fld0VarM21518s2.m41997s((String) g6f.m43741q0(list2));
                                                                        fld0VarM21518s2.m41998t(i5);
                                                                        fld0VarM21518s2.m41995q(i4);
                                                                        fld0VarM21518s2.m41996r(bga1VarM49004q);
                                                                        mediaResource = (MediaResource) fld0VarM21518s2.build();
                                                                    }
                                                                    yfd0 yfd0Var = zfd0Var.f282284a.f208534c;
                                                                    if (yfd0Var instanceof xfd0) {
                                                                        arrayList = arrayList;
                                                                        try {
                                                                            ArrayList arrayList5 = new ArrayList(i6f.m49804T(list2, 10));
                                                                            for (Iterator it4 = list2.iterator(); it4.hasNext(); it4 = it4) {
                                                                                String str11 = (String) it4.next();
                                                                                fld0 fld0VarM21518s3 = MediaResource.m21518s();
                                                                                fld0VarM21518s3.m41997s(str11);
                                                                                fld0VarM21518s3.m41998t(i5);
                                                                                fld0VarM21518s3.m41995q(i4);
                                                                                fld0VarM21518s3.m41996r(bga1VarM49004q);
                                                                                bks bksVarM1929s = Duration.m1929s();
                                                                                bksVarM1929s.m29723q(hga1Var.f91110h);
                                                                                fld0VarM21518s3.m41994m(bksVarM1929s);
                                                                                arrayList5.add((MediaResource) fld0VarM21518s3.build());
                                                                            }
                                                                            vdd0 vdd0VarM21512p = MediaFile.m21512p();
                                                                            hzb1 hzb1VarM21524p = VideoMedia.m21524p();
                                                                            hzb1VarM21524p.m49261m(arrayList5);
                                                                            hzb1VarM21524p.m49262q(mediaResource);
                                                                            vdd0VarM21512p.m85222q((VideoMedia) hzb1VarM21524p.build());
                                                                            mediaFile = (MediaFile) vdd0VarM21512p.build();
                                                                        } catch (IOException unused5) {
                                                                            arrayList = arrayList;
                                                                            obj = obj5;
                                                                            obj4 = null;
                                                                            str4 = str6;
                                                                            r2 = obj4;
                                                                            oyd0Var2.f171746a = r2;
                                                                            oyd0Var2.f171747b = r2;
                                                                            oyd0Var2.f171748c = r2;
                                                                            oyd0Var2.f171749d = r2;
                                                                            oyd0Var2.f171750e = r2;
                                                                            oyd0Var2.f171753h = 2;
                                                                            if (tyd0Var.m81969k(true, str4, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                                return obj;
                                                                            }
                                                                            return w2a1Var;
                                                                        } catch (HttpException e3) {
                                                                            e = e3;
                                                                            arrayList = arrayList;
                                                                            obj = obj5;
                                                                            z = true;
                                                                            str5 = str6;
                                                                            if (e.f288164a == 400) {
                                                                                z2 = z;
                                                                            } else {
                                                                                z2 = false;
                                                                            }
                                                                            oyd0Var2.f171746a = null;
                                                                            oyd0Var2.f171747b = null;
                                                                            oyd0Var2.f171748c = null;
                                                                            oyd0Var2.f171749d = null;
                                                                            oyd0Var2.f171750e = null;
                                                                            oyd0Var2.f171753h = 3;
                                                                            if (tyd0Var.m81969k(z2, str5, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                                return obj;
                                                                            }
                                                                            return w2a1Var;
                                                                        } catch (Exception unused6) {
                                                                            arrayList = arrayList;
                                                                            obj = obj5;
                                                                            obj3 = null;
                                                                            str3 = str6;
                                                                            r1 = obj3;
                                                                            oyd0Var2.f171746a = r1;
                                                                            oyd0Var2.f171747b = r1;
                                                                            oyd0Var2.f171748c = r1;
                                                                            oyd0Var2.f171749d = r1;
                                                                            oyd0Var2.f171750e = r1;
                                                                            oyd0Var2.f171753h = 4;
                                                                            if (tyd0Var.m81969k(false, str3, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                                return obj;
                                                                            }
                                                                            return w2a1Var;
                                                                        }
                                                                    } else {
                                                                        arrayList = arrayList;
                                                                        if (!(yfd0Var instanceof wfd0)) {
                                                                            throw new NoWhenBranchMatchedException();
                                                                        }
                                                                        fld0 fld0VarM21518s4 = MediaResource.m21518s();
                                                                        fld0VarM21518s4.m41997s((String) g6f.m43741q0(list2));
                                                                        fld0VarM21518s4.m41998t(i5);
                                                                        fld0VarM21518s4.m41995q(i4);
                                                                        fld0VarM21518s4.m41996r(bga1VarM49004q);
                                                                        MediaResource mediaResource2 = (MediaResource) fld0VarM21518s4.build();
                                                                        vdd0 vdd0VarM21512p2 = MediaFile.m21512p();
                                                                        o940 o940VarM21505p = ImageMedia.m21505p();
                                                                        o940VarM21505p.m66443m(mediaResource2);
                                                                        o940VarM21505p.m66444q(mediaResource);
                                                                        vdd0VarM21512p2.m85221m((ImageMedia) o940VarM21505p.build());
                                                                        mediaFile = (MediaFile) vdd0VarM21512p2.build();
                                                                    }
                                                                    arrayList4.add(mediaFile);
                                                                    yyd0Var3 = yyd0Var;
                                                                    arrayList = arrayList;
                                                                    it2 = it3;
                                                                    w2a1Var2 = w2a1Var;
                                                                    obj7 = obj5;
                                                                    uyd0Var = uyd0Var;
                                                                    z3 = true;
                                                                    obj6 = null;
                                                                } catch (IOException unused7) {
                                                                    obj = obj5;
                                                                    obj4 = null;
                                                                    str4 = str6;
                                                                    r2 = obj4;
                                                                    oyd0Var2.f171746a = r2;
                                                                    oyd0Var2.f171747b = r2;
                                                                    oyd0Var2.f171748c = r2;
                                                                    oyd0Var2.f171749d = r2;
                                                                    oyd0Var2.f171750e = r2;
                                                                    oyd0Var2.f171753h = 2;
                                                                    if (tyd0Var.m81969k(true, str4, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                        return obj;
                                                                    }
                                                                    return w2a1Var;
                                                                } catch (HttpException e4) {
                                                                    e = e4;
                                                                    obj = obj5;
                                                                    z = true;
                                                                    str5 = str6;
                                                                    if (e.f288164a == 400) {
                                                                        z2 = z;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    oyd0Var2.f171746a = null;
                                                                    oyd0Var2.f171747b = null;
                                                                    oyd0Var2.f171748c = null;
                                                                    oyd0Var2.f171749d = null;
                                                                    oyd0Var2.f171750e = null;
                                                                    oyd0Var2.f171753h = 3;
                                                                    if (tyd0Var.m81969k(z2, str5, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                        return obj;
                                                                    }
                                                                    return w2a1Var;
                                                                } catch (Exception unused8) {
                                                                    obj = obj5;
                                                                    obj3 = null;
                                                                    str3 = str6;
                                                                    r1 = obj3;
                                                                    oyd0Var2.f171746a = r1;
                                                                    oyd0Var2.f171747b = r1;
                                                                    oyd0Var2.f171748c = r1;
                                                                    oyd0Var2.f171749d = r1;
                                                                    oyd0Var2.f171750e = r1;
                                                                    oyd0Var2.f171753h = 4;
                                                                    if (tyd0Var.m81969k(false, str3, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                        return obj;
                                                                    }
                                                                    return w2a1Var;
                                                                }
                                                            } catch (IOException unused9) {
                                                                obj5 = obj7;
                                                                arrayList = arrayList;
                                                                obj = obj5;
                                                                obj4 = null;
                                                                str4 = str6;
                                                                r2 = obj4;
                                                                oyd0Var2.f171746a = r2;
                                                                oyd0Var2.f171747b = r2;
                                                                oyd0Var2.f171748c = r2;
                                                                oyd0Var2.f171749d = r2;
                                                                oyd0Var2.f171750e = r2;
                                                                oyd0Var2.f171753h = 2;
                                                                if (tyd0Var.m81969k(true, str4, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                    return obj;
                                                                }
                                                                return w2a1Var;
                                                            } catch (HttpException e5) {
                                                                e = e5;
                                                                obj5 = obj7;
                                                                arrayList = arrayList;
                                                                obj = obj5;
                                                                z = true;
                                                                str5 = str6;
                                                                if (e.f288164a == 400) {
                                                                    z2 = z;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                oyd0Var2.f171746a = null;
                                                                oyd0Var2.f171747b = null;
                                                                oyd0Var2.f171748c = null;
                                                                oyd0Var2.f171749d = null;
                                                                oyd0Var2.f171750e = null;
                                                                oyd0Var2.f171753h = 3;
                                                                if (tyd0Var.m81969k(z2, str5, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                    return obj;
                                                                }
                                                                return w2a1Var;
                                                            } catch (Exception unused10) {
                                                                obj5 = obj7;
                                                                arrayList = arrayList;
                                                                obj = obj5;
                                                                obj3 = null;
                                                                str3 = str6;
                                                                r1 = obj3;
                                                                oyd0Var2.f171746a = r1;
                                                                oyd0Var2.f171747b = r1;
                                                                oyd0Var2.f171748c = r1;
                                                                oyd0Var2.f171749d = r1;
                                                                oyd0Var2.f171750e = r1;
                                                                oyd0Var2.f171753h = 4;
                                                                if (tyd0Var.m81969k(false, str3, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                    return obj;
                                                                }
                                                                return w2a1Var;
                                                            }
                                                        } catch (IOException unused11) {
                                                            w2a1Var = w2a1Var2;
                                                        } catch (HttpException e6) {
                                                            e = e6;
                                                            w2a1Var = w2a1Var2;
                                                        } catch (Exception unused12) {
                                                            w2a1Var = w2a1Var2;
                                                        }
                                                    } catch (IOException unused13) {
                                                        w2a1Var = w2a1Var2;
                                                        yyd0Var = yyd0Var;
                                                        str7 = str7;
                                                        obj = obj7;
                                                    } catch (Exception unused14) {
                                                        w2a1Var = w2a1Var2;
                                                        yyd0Var = yyd0Var;
                                                        str7 = str7;
                                                        obj = obj7;
                                                    }
                                                } catch (HttpException e7) {
                                                    e = e7;
                                                    w2a1Var = w2a1Var2;
                                                    obj5 = obj7;
                                                }
                                            } catch (IOException unused15) {
                                                w2a1Var = w2a1Var2;
                                                yyd0Var = yyd0Var;
                                                str7 = str7;
                                                obj4 = obj6;
                                                obj = obj7;
                                            } catch (Exception unused16) {
                                                w2a1Var = w2a1Var2;
                                                yyd0Var = yyd0Var;
                                                str7 = str7;
                                                obj3 = obj6;
                                                obj = obj7;
                                            }
                                        }
                                        ArrayList arrayList6 = arrayList;
                                        w2a1Var = w2a1Var2;
                                        uyd0 uyd0Var2 = uyd0Var;
                                        Object obj9 = obj7;
                                        try {
                                            es51VarM21521p.m39886m(arrayList4);
                                            SubmitChatMediaUploadRequest submitChatMediaUploadRequest = (SubmitChatMediaUploadRequest) es51VarM21521p.build();
                                            oyd0Var2.f171746a = str6;
                                            oyd0Var2.f171747b = str7;
                                            oyd0Var2.f171748c = eyd0Var2;
                                            yyd0Var2 = yyd0Var;
                                            try {
                                                oyd0Var2.f171749d = yyd0Var2;
                                                arrayList2 = arrayList6;
                                                try {
                                                    try {
                                                        oyd0Var2.f171750e = arrayList2;
                                                        z = true;
                                                        try {
                                                            oyd0Var2.f171753h = 1;
                                                            objM84194a = uyd0Var2.m84194a(submitChatMediaUploadRequest, oyd0Var2);
                                                            obj = obj9;
                                                            if (objM84194a == obj) {
                                                                return obj;
                                                            }
                                                        } catch (HttpException e8) {
                                                            e = e8;
                                                            obj = obj9;
                                                            yyd0Var = yyd0Var2;
                                                            arrayList = arrayList2;
                                                            str7 = str7;
                                                            str5 = str6;
                                                            if (e.f288164a == 400) {
                                                                z2 = z;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            oyd0Var2.f171746a = null;
                                                            oyd0Var2.f171747b = null;
                                                            oyd0Var2.f171748c = null;
                                                            oyd0Var2.f171749d = null;
                                                            oyd0Var2.f171750e = null;
                                                            oyd0Var2.f171753h = 3;
                                                            if (tyd0Var.m81969k(z2, str5, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                                return obj;
                                                            }
                                                            return w2a1Var;
                                                        }
                                                    } catch (HttpException e9) {
                                                        e = e9;
                                                        obj = obj9;
                                                        z = true;
                                                        yyd0Var = yyd0Var2;
                                                        arrayList = arrayList2;
                                                        str7 = str7;
                                                        str5 = str6;
                                                        if (e.f288164a == 400) {
                                                            z2 = z;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        oyd0Var2.f171746a = null;
                                                        oyd0Var2.f171747b = null;
                                                        oyd0Var2.f171748c = null;
                                                        oyd0Var2.f171749d = null;
                                                        oyd0Var2.f171750e = null;
                                                        oyd0Var2.f171753h = 3;
                                                        if (tyd0Var.m81969k(z2, str5, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                            return obj;
                                                        }
                                                        return w2a1Var;
                                                    }
                                                } catch (IOException unused17) {
                                                    obj = obj9;
                                                    yyd0Var = yyd0Var2;
                                                    arrayList = arrayList2;
                                                    obj2 = null;
                                                    str7 = str7;
                                                    obj4 = obj2;
                                                    str4 = str6;
                                                    r2 = obj4;
                                                    oyd0Var2.f171746a = r2;
                                                    oyd0Var2.f171747b = r2;
                                                    oyd0Var2.f171748c = r2;
                                                    oyd0Var2.f171749d = r2;
                                                    oyd0Var2.f171750e = r2;
                                                    oyd0Var2.f171753h = 2;
                                                    if (tyd0Var.m81969k(true, str4, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                        return obj;
                                                    }
                                                    return w2a1Var;
                                                } catch (Exception unused18) {
                                                    obj = obj9;
                                                    yyd0Var = yyd0Var2;
                                                    arrayList = arrayList2;
                                                    obj3 = null;
                                                    str7 = str7;
                                                    str3 = str6;
                                                    r1 = obj3;
                                                    oyd0Var2.f171746a = r1;
                                                    oyd0Var2.f171747b = r1;
                                                    oyd0Var2.f171748c = r1;
                                                    oyd0Var2.f171749d = r1;
                                                    oyd0Var2.f171750e = r1;
                                                    oyd0Var2.f171753h = 4;
                                                    if (tyd0Var.m81969k(false, str3, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                        return obj;
                                                    }
                                                    return w2a1Var;
                                                }
                                            } catch (IOException unused19) {
                                                arrayList2 = arrayList6;
                                                obj = obj9;
                                                yyd0Var = yyd0Var2;
                                                arrayList = arrayList2;
                                                obj2 = null;
                                                str7 = str7;
                                                obj4 = obj2;
                                                str4 = str6;
                                                r2 = obj4;
                                                oyd0Var2.f171746a = r2;
                                                oyd0Var2.f171747b = r2;
                                                oyd0Var2.f171748c = r2;
                                                oyd0Var2.f171749d = r2;
                                                oyd0Var2.f171750e = r2;
                                                oyd0Var2.f171753h = 2;
                                                if (tyd0Var.m81969k(true, str4, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                    return obj;
                                                }
                                                return w2a1Var;
                                            } catch (HttpException e10) {
                                                e = e10;
                                                arrayList2 = arrayList6;
                                                obj = obj9;
                                                z = true;
                                                yyd0Var = yyd0Var2;
                                                arrayList = arrayList2;
                                                str7 = str7;
                                                str5 = str6;
                                                if (e.f288164a == 400) {
                                                    z2 = z;
                                                } else {
                                                    z2 = false;
                                                }
                                                oyd0Var2.f171746a = null;
                                                oyd0Var2.f171747b = null;
                                                oyd0Var2.f171748c = null;
                                                oyd0Var2.f171749d = null;
                                                oyd0Var2.f171750e = null;
                                                oyd0Var2.f171753h = 3;
                                                if (tyd0Var.m81969k(z2, str5, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                    return obj;
                                                }
                                                return w2a1Var;
                                            } catch (Exception unused20) {
                                                arrayList2 = arrayList6;
                                                obj = obj9;
                                                yyd0Var = yyd0Var2;
                                                arrayList = arrayList2;
                                                obj3 = null;
                                                str7 = str7;
                                                str3 = str6;
                                                r1 = obj3;
                                                oyd0Var2.f171746a = r1;
                                                oyd0Var2.f171747b = r1;
                                                oyd0Var2.f171748c = r1;
                                                oyd0Var2.f171749d = r1;
                                                oyd0Var2.f171750e = r1;
                                                oyd0Var2.f171753h = 4;
                                                if (tyd0Var.m81969k(false, str3, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                                    return obj;
                                                }
                                                return w2a1Var;
                                            }
                                        } catch (IOException unused21) {
                                            yyd0Var2 = yyd0Var;
                                        } catch (HttpException e11) {
                                            e = e11;
                                            yyd0Var2 = yyd0Var;
                                        } catch (Exception unused22) {
                                            yyd0Var2 = yyd0Var;
                                        }
                                    } catch (IOException unused23) {
                                        w2a1Var = w2a1Var2;
                                        obj = obj7;
                                        yyd0Var = yyd0Var3;
                                    }
                                } catch (IOException unused24) {
                                    w2a1Var = w2a1Var2;
                                    obj2 = null;
                                    obj = obj7;
                                    yyd0Var = yyd0Var3;
                                    str7 = str7;
                                    obj4 = obj2;
                                    str4 = str6;
                                    r2 = obj4;
                                    oyd0Var2.f171746a = r2;
                                    oyd0Var2.f171747b = r2;
                                    oyd0Var2.f171748c = r2;
                                    oyd0Var2.f171749d = r2;
                                    oyd0Var2.f171750e = r2;
                                    oyd0Var2.f171753h = 2;
                                    if (tyd0Var.m81969k(true, str4, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                                        return obj;
                                    }
                                    return w2a1Var;
                                }
                            } catch (HttpException e12) {
                                e = e12;
                                w2a1Var = w2a1Var2;
                                z = z3;
                                obj = obj7;
                                yyd0Var = yyd0Var3;
                            } catch (Exception unused25) {
                                w2a1Var = w2a1Var2;
                                obj = obj7;
                                yyd0Var = yyd0Var3;
                            }
                        }
                        yyd0Var3.m94888b(i);
                        return w2a1Var2;
                        yyd0Var2.m94888b(1);
                    } catch (HttpException e13) {
                        e = e13;
                        yyd0Var = yyd0Var2;
                        arrayList = arrayList2;
                        str7 = str7;
                        str5 = str6;
                        if (e.f288164a == 400) {
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        oyd0Var2.f171746a = null;
                        oyd0Var2.f171747b = null;
                        oyd0Var2.f171748c = null;
                        oyd0Var2.f171749d = null;
                        oyd0Var2.f171750e = null;
                        oyd0Var2.f171753h = 3;
                        if (tyd0Var.m81969k(z2, str5, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                            return obj;
                        }
                    }
                    m81965n(eyd0Var2, str7, arrayList2, new n2d0((SubmitChatMediaUploadResponse) objM84194a, 6));
                    yyd0Var2.m94887a();
                    z = true;
                } catch (HttpException e14) {
                    e = e14;
                    z = true;
                    yyd0Var = yyd0Var2;
                    arrayList = arrayList2;
                    str7 = str7;
                    str5 = str6;
                    if (e.f288164a == 400) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    oyd0Var2.f171746a = null;
                    oyd0Var2.f171747b = null;
                    oyd0Var2.f171748c = null;
                    oyd0Var2.f171749d = null;
                    oyd0Var2.f171750e = null;
                    oyd0Var2.f171753h = 3;
                    if (tyd0Var.m81969k(z2, str5, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                        return obj;
                    }
                    return w2a1Var;
                }
            } catch (IOException unused26) {
                yyd0Var = yyd0Var2;
                arrayList = arrayList2;
                obj2 = null;
                str7 = str7;
                obj4 = obj2;
                str4 = str6;
                r2 = obj4;
                oyd0Var2.f171746a = r2;
                oyd0Var2.f171747b = r2;
                oyd0Var2.f171748c = r2;
                oyd0Var2.f171749d = r2;
                oyd0Var2.f171750e = r2;
                oyd0Var2.f171753h = 2;
                if (tyd0Var.m81969k(true, str4, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                    return obj;
                }
            } catch (Exception unused27) {
                yyd0Var = yyd0Var2;
                arrayList = arrayList2;
                obj3 = null;
                str7 = str7;
                str3 = str6;
                r1 = obj3;
                oyd0Var2.f171746a = r1;
                oyd0Var2.f171747b = r1;
                oyd0Var2.f171748c = r1;
                oyd0Var2.f171749d = r1;
                oyd0Var2.f171750e = r1;
                oyd0Var2.f171753h = 4;
                if (tyd0Var.m81969k(false, str3, eyd0Var2, str7, arrayList, yyd0Var, oyd0Var2) == obj) {
                    return obj;
                }
            }
            return w2a1Var;
        } catch (CancellationException e15) {
            throw e15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Serializable m81960d(tyd0 tyd0Var, jb9 jb9Var, List list, String str, ibk ibkVar) {
        pyd0 pyd0Var;
        ArrayList arrayList;
        fyd0 fyd0Var;
        if (ibkVar instanceof pyd0) {
            pyd0Var = (pyd0) ibkVar;
            int i = pyd0Var.f183395e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pyd0Var.f183395e = i - Integer.MIN_VALUE;
            } else {
                pyd0Var = new pyd0(tyd0Var, ibkVar);
            }
        } else {
            pyd0Var = new pyd0(tyd0Var, ibkVar);
        }
        Object obj = pyd0Var.f183393c;
        int i2 = pyd0Var.f183395e;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(obj);
            File file = new File(tyd0Var.f224927c.f223165a.getCacheDir(), "campfire_media_upload/".concat(str));
            file.mkdirs();
            String absolutePath = file.getAbsolutePath();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((sfd0) obj2).f208534c instanceof xfd0) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((sfd0) it.next()).f208532a);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list) {
                if (((sfd0) obj3).f208534c instanceof wfd0) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList(i6f.m49804T(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((sfd0) it2.next()).f208532a);
            }
            i59 i59Var = new i59(arrayList3, arrayList5);
            x49 x49Var = new x49(absolutePath);
            arrayList = new ArrayList();
            jb9Var.getClass();
            yab yabVarM65827f = nxf1.m65827f(new C1977ig(jb9Var, i59Var, x49Var, fbkVar, 23));
            zzb0 zzb0Var = new zzb0(arrayList, 5);
            pyd0Var.f183391a = list;
            pyd0Var.f183392b = arrayList;
            pyd0Var.f183395e = 1;
            Object objCollect = yabVarM65827f.collect(zzb0Var, pyd0Var);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = pyd0Var.f183392b;
            list = (List) pyd0Var.f183391a;
            bga.m29073P(obj);
        }
        int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj4 : arrayList) {
            linkedHashMap.put(((h49) obj4).mo40721a(), obj4);
        }
        ArrayList arrayList6 = new ArrayList(i6f.m49804T(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            h49 h49Var = (h49) kkc0.m56692e0(((sfd0) it3.next()).f208532a, linkedHashMap);
            if (h49Var instanceof g49) {
                g49 g49Var = (g49) h49Var;
                String str2 = g49Var.f76371c;
                Integer num = g49Var.f76373e;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = g49Var.f76374f;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                ki71 ki71Var = g49Var.f76375g;
                fyd0Var = new fyd0(iIntValue, iIntValue2, ki71Var != null ? ki71Var.f122875b : 0, ki71Var != null ? ki71Var.f122876c : 0, str2, ki71Var != null ? ki71Var.f122874a : null);
            } else {
                if (!(h49Var instanceof f49)) {
                    throw new NoWhenBranchMatchedException();
                }
                f49 f49Var = (f49) h49Var;
                fyd0Var = new fyd0(f49Var.f65708e, f49Var.f65709f, 0, 0, f49Var.f65706c, null);
            }
            arrayList6.add(fyd0Var);
        }
        return arrayList6;
    }

    /* JADX INFO: renamed from: e */
    public static final void m81961e(tyd0 tyd0Var, eyd0 eyd0Var, String str, String str2, jga1 jga1Var) {
        Object value;
        Map mapM56701n0;
        zv41 zv41Var = eyd0Var.f64054b;
        do {
            value = zv41Var.getValue();
            mapM56701n0 = (Map) value;
            List<zfd0> list = (List) mapM56701n0.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (zfd0 zfd0VarM96006a : list) {
                    if (wj50.m88271j(zfd0VarM96006a.f282284a.f208532a, str2)) {
                        zfd0VarM96006a = zfd0.m96006a(zfd0VarM96006a, jga1Var, false, 5);
                    }
                    arrayList.add(zfd0VarM96006a);
                }
                mapM56701n0 = kkc0.m56701n0(mapM56701n0, new pqm0(str, arrayList));
            }
        } while (!zv41Var.m97089k(value, mapM56701n0));
    }

    /* JADX INFO: renamed from: f */
    public static final Object m81962f(tyd0 tyd0Var, String str, List list, long j, ib9 ib9Var) {
        Object objM56684z = kk40.m56684z(new qyd0(list, tyd0Var, j, new File(str).length(), str, null), ib9Var);
        return objM56684z == yuk.f276404a ? objM56684z : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: g */
    public static final Object m81963g(tyd0 tyd0Var, String str, String str2, ib9 ib9Var) {
        File file = new File(str);
        urv0 urv0Var = ayd0.f21209e;
        Object objM81968j = tyd0Var.m81968j(new cuw0(zn91.m96520H("application/octet-stream"), file), str2, ib9Var);
        return objM81968j == yuk.f276404a ? objM81968j : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: h */
    public static final Object m81964h(tyd0 tyd0Var, eyd0 eyd0Var, String str, List list, List list2, ArrayList arrayList, ArrayList arrayList2, long j, nyd0 nyd0Var) {
        Object objM56684z = kk40.m56684z(new ryd0(list, list2, arrayList, arrayList2, tyd0Var, j, eyd0Var, str, null), nyd0Var);
        return objM56684z == yuk.f276404a ? objM56684z : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: n */
    public static void m81965n(eyd0 eyd0Var, String str, List list, gh00 gh00Var) {
        Object value;
        Map mapM56701n0;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zfd0) it.next()).f282284a.f208532a);
        }
        Set setM43736n1 = g6f.m43736n1(arrayList);
        zv41 zv41Var = eyd0Var.f64054b;
        do {
            value = zv41Var.getValue();
            mapM56701n0 = (Map) value;
            List<zfd0> list2 = (List) mapM56701n0.get(str);
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
                for (zfd0 zfd0VarM96006a : list2) {
                    jga1 jga1Var = zfd0VarM96006a.f282285b;
                    if (setM43736n1.contains(zfd0VarM96006a.f282284a.f208532a) && (jga1Var instanceof hga1)) {
                        zfd0VarM96006a = zfd0.m96006a(zfd0VarM96006a, (jga1) gh00Var.invoke(jga1Var), false, 5);
                    }
                    arrayList2.add(zfd0VarM96006a);
                }
                mapM56701n0 = kkc0.m56701n0(mapM56701n0, new pqm0(str, arrayList2));
            }
        } while (!zv41Var.m97089k(value, mapM56701n0));
    }

    /* JADX INFO: renamed from: o */
    public static void m81966o(eyd0 eyd0Var, String str, jga1 jga1Var) {
        Object value;
        Map mapM56701n0;
        zv41 zv41Var = eyd0Var.f64054b;
        do {
            value = zv41Var.getValue();
            mapM56701n0 = (Map) value;
            List<zfd0> list = (List) mapM56701n0.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (zfd0 zfd0VarM96006a : list) {
                    if (!(zfd0VarM96006a.f282285b instanceof hga1)) {
                        zfd0VarM96006a = zfd0.m96006a(zfd0VarM96006a, jga1Var, false, 5);
                    }
                    arrayList.add(zfd0VarM96006a);
                }
                mapM56701n0 = kkc0.m56701n0(mapM56701n0, new pqm0(str, arrayList));
            }
        } while (!zv41Var.m97089k(value, mapM56701n0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m81967i(String str, String str2, ibk ibkVar) {
        gyd0 gyd0Var;
        eyd0 eyd0Var;
        Object value;
        if (ibkVar instanceof gyd0) {
            gyd0Var = (gyd0) ibkVar;
            int i = gyd0Var.f85554e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gyd0Var.f85554e = i - Integer.MIN_VALUE;
            } else {
                gyd0Var = new gyd0(this, ibkVar);
            }
        } else {
            gyd0Var = new gyd0(this, ibkVar);
        }
        Object obj = gyd0Var.f85552c;
        int i2 = gyd0Var.f85554e;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(obj);
            eyd0Var = (eyd0) this.f224933i.get(str);
            if (eyd0Var == null) {
                return w2a1Var;
            }
            eyd0Var.f64056d.remove(str2);
            m81966o(eyd0Var, str2, dga1.f48763a);
            tf60 tf60Var = (tf60) eyd0Var.f64055c.get(str2);
            if (tf60Var != null) {
                gyd0Var.f85550a = str2;
                gyd0Var.f85551b = eyd0Var;
                gyd0Var.f85554e = 1;
                Object objM73213r = qlg1.m73213r(tf60Var, gyd0Var);
                yuk yukVar = yuk.f276404a;
                if (objM73213r == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eyd0Var = gyd0Var.f85551b;
            str2 = gyd0Var.f85550a;
            bga.m29073P(obj);
        }
        zv41 zv41Var = eyd0Var.f64054b;
        do {
            value = zv41Var.getValue();
        } while (!zv41Var.m97089k(value, kkc0.m56696i0(str2, (Map) value)));
        eyd0Var.f64055c.remove(str2);
        return w2a1Var;
    }

    /* JADX INFO: renamed from: j */
    public final Object m81968j(euw0 euw0Var, String str, mb61 mb61Var) {
        w2a1 w2a1Var = w2a1.f247311a;
        hqb hqbVar = new hqb(1, seg1.m77914f(mb61Var));
        hqbVar.m48222q();
        ztw0 ztw0Var = new ztw0();
        ztw0Var.m96954g(str);
        ztw0Var.f286277c.m77925B("Content-Encoding", "identity");
        ztw0Var.m96951d(Request.PUT, euw0Var);
        zuu0 zuu0VarM95348b = this.f224931g.m95348b(new auw0(ztw0Var));
        hqbVar.mo42415l(new hyd0(zuu0VarM95348b, 0));
        try {
            n2x0 n2x0VarM97071g = zuu0VarM95348b.m97071g();
            try {
                if (n2x0VarM97071g.f149852O0) {
                    hqbVar.resumeWith(w2a1Var);
                } else {
                    hqbVar.resumeWith(new c6x0(new IOException("Upload failed: " + n2x0VarM97071g.f149860d)));
                }
                n2x0VarM97071g.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n0e1.m63430g(n2x0VarM97071g, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            if (hqbVar.isActive()) {
                hqbVar.resumeWith(new c6x0(e));
            }
        }
        Object objM48221p = hqbVar.m48221p();
        return objM48221p == yuk.f276404a ? objM48221p : w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e A[PHI: r7 r8 r9 r10
      0x005e: PHI (r7v1 p.eyd0) = (r7v0 p.eyd0), (r7v2 p.eyd0) binds: [B:15:0x0038, B:20:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v2 java.lang.String) binds: [B:15:0x0038, B:20:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r9v1 java.util.List) = (r9v0 java.util.List), (r9v2 java.util.List) binds: [B:15:0x0038, B:20:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r10v1 p.yyd0) = (r10v0 p.yyd0), (r10v2 p.yyd0) binds: [B:15:0x0038, B:20:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m81969k(boolean z, String str, eyd0 eyd0Var, String str2, List list, yyd0 yyd0Var, ibk ibkVar) {
        iyd0 iyd0Var;
        if (ibkVar instanceof iyd0) {
            iyd0Var = (iyd0) ibkVar;
            int i = iyd0Var.f106962g;
            if ((i & Integer.MIN_VALUE) != 0) {
                iyd0Var.f106962g = i - Integer.MIN_VALUE;
            } else {
                iyd0Var = new iyd0(this, ibkVar);
            }
        } else {
            iyd0Var = new iyd0(this, ibkVar);
        }
        Object objM81972p = iyd0Var.f106960e;
        int i2 = iyd0Var.f106962g;
        if (i2 == 0) {
            bga.m29073P(objM81972p);
            if (z) {
                iyd0Var.f106956a = eyd0Var;
                iyd0Var.f106957b = str2;
                iyd0Var.f106958c = list;
                iyd0Var.f106959d = yyd0Var;
                iyd0Var.f106962g = 1;
                objM81972p = m81972p(str, list, iyd0Var);
                Object obj = yuk.f276404a;
                if (objM81972p == obj) {
                    return obj;
                }
            } else {
                yyd0Var.m94888b(5);
                m81965n(eyd0Var, str2, list, pvd0.f181694L0);
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yyd0Var = iyd0Var.f106959d;
        list = iyd0Var.f106958c;
        str2 = iyd0Var.f106957b;
        eyd0Var = iyd0Var.f106956a;
        bga.m29073P(objM81972p);
        if (((Boolean) objM81972p).booleanValue()) {
            m81965n(eyd0Var, str2, list, pvd0.f181710Z);
            yyd0Var.m94888b(1);
        } else {
            yyd0Var.m94888b(5);
            m81965n(eyd0Var, str2, list, pvd0.f181694L0);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: l */
    public final prb0 m81970l(String str) {
        return new prb0(((eyd0) this.f224933i.computeIfAbsent(str, new lyd0(this, 0))).f64054b, 14);
    }

    /* JADX INFO: renamed from: m */
    public final void m81971m(String str, String str2, ArrayList arrayList, boolean z) {
        LinkedHashMap linkedHashMap;
        if (arrayList.isEmpty()) {
            return;
        }
        String str3 = str;
        eyd0 eyd0Var = (eyd0) this.f224933i.computeIfAbsent(str3, new lyd0(this, 2));
        synchronized (eyd0Var) {
            try {
                if (eyd0Var.f64055c.containsKey(str2)) {
                    return;
                }
                zv41 zv41Var = eyd0Var.f64054b;
                while (true) {
                    Object value = zv41Var.getValue();
                    Map map = (Map) value;
                    List list = (List) map.get(str2);
                    if (list != null) {
                        int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
                        if (iM31820L < 16) {
                            iM31820L = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iM31820L);
                        for (Object obj : list) {
                            linkedHashMap.put(((zfd0) obj).f282284a.f208532a, obj);
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                    for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                        sfd0 sfd0Var = (sfd0) it.next();
                        zfd0 zfd0Var = linkedHashMap != null ? (zfd0) linkedHashMap.get(sfd0Var.f208532a) : null;
                        jga1 jga1Var = zfd0Var != null ? zfd0Var.f282285b : null;
                        if (jga1Var instanceof hga1) {
                            if (z != 0) {
                                zfd0Var = zfd0.m96006a(zfd0Var, null, true, 3);
                            }
                        } else if (jga1Var instanceof gga1) {
                            zfd0Var = zfd0.m96006a(zfd0Var, new hga1(((gga1) jga1Var).f79585a, ((gga1) jga1Var).f79586b, ((gga1) jga1Var).f79587c, ((gga1) jga1Var).f79588d, ((gga1) jga1Var).f79589e, ((gga1) jga1Var).f79590f, ((gga1) jga1Var).f79591g, ((gga1) jga1Var).f79592h), z != 0 || zfd0Var.f282286c, 1);
                        } else {
                            zfd0Var = new zfd0(sfd0Var, iga1.f101941a, z);
                        }
                        arrayList2.add(zfd0Var);
                    }
                    if (zv41Var.m97089k(value, kkc0.m56701n0(map, new pqm0(str2, arrayList2)))) {
                        eyd0Var.f64055c.put(str2, x0h1.m89578u(eyd0Var.f64053a, null, 0, new nyd0(this, arrayList, z, eyd0Var, str2, str3, null), 3));
                        return;
                    }
                    str3 = str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7 A[Catch: CancellationException -> 0x0032, Exception -> 0x0140, TryCatch #4 {CancellationException -> 0x0032, Exception -> 0x0140, blocks: (B:13:0x002d, B:49:0x00d8, B:50:0x00de, B:52:0x00e7, B:61:0x0107, B:55:0x00ee, B:56:0x00f2, B:58:0x00f8, B:63:0x010a, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:71:0x0129, B:73:0x0131, B:41:0x00a3, B:45:0x00bb, B:20:0x0047), top: B:87:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee A[Catch: CancellationException -> 0x0032, Exception -> 0x0140, TryCatch #4 {CancellationException -> 0x0032, Exception -> 0x0140, blocks: (B:13:0x002d, B:49:0x00d8, B:50:0x00de, B:52:0x00e7, B:61:0x0107, B:55:0x00ee, B:56:0x00f2, B:58:0x00f8, B:63:0x010a, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:71:0x0129, B:73:0x0131, B:41:0x00a3, B:45:0x00bb, B:20:0x0047), top: B:87:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8 A[Catch: CancellationException -> 0x0032, Exception -> 0x0140, TryCatch #4 {CancellationException -> 0x0032, Exception -> 0x0140, blocks: (B:13:0x002d, B:49:0x00d8, B:50:0x00de, B:52:0x00e7, B:61:0x0107, B:55:0x00ee, B:56:0x00f2, B:58:0x00f8, B:63:0x010a, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:71:0x0129, B:73:0x0131, B:41:0x00a3, B:45:0x00bb, B:20:0x0047), top: B:87:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0110  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111 A[Catch: CancellationException -> 0x0032, Exception -> 0x0140, TryCatch #4 {CancellationException -> 0x0032, Exception -> 0x0140, blocks: (B:13:0x002d, B:49:0x00d8, B:50:0x00de, B:52:0x00e7, B:61:0x0107, B:55:0x00ee, B:56:0x00f2, B:58:0x00f8, B:63:0x010a, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:71:0x0129, B:73:0x0131, B:41:0x00a3, B:45:0x00bb, B:20:0x0047), top: B:87:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x011b A[Catch: CancellationException -> 0x0032, Exception -> 0x0140, TryCatch #4 {CancellationException -> 0x0032, Exception -> 0x0140, blocks: (B:13:0x002d, B:49:0x00d8, B:50:0x00de, B:52:0x00e7, B:61:0x0107, B:55:0x00ee, B:56:0x00f2, B:58:0x00f8, B:63:0x010a, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:71:0x0129, B:73:0x0131, B:41:0x00a3, B:45:0x00bb, B:20:0x0047), top: B:87:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0129 A[Catch: CancellationException -> 0x0032, Exception -> 0x0140, TryCatch #4 {CancellationException -> 0x0032, Exception -> 0x0140, blocks: (B:13:0x002d, B:49:0x00d8, B:50:0x00de, B:52:0x00e7, B:61:0x0107, B:55:0x00ee, B:56:0x00f2, B:58:0x00f8, B:63:0x010a, B:66:0x0111, B:67:0x0115, B:69:0x011b, B:71:0x0129, B:73:0x0131, B:41:0x00a3, B:45:0x00bb, B:20:0x0047), top: B:87:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0131 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d3 -> B:49:0x00d8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: p */
    public final java.lang.Object m81972p(java.lang.String r10, java.util.List r11, p204p.ibk r12) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.tyd0.m81972p(java.lang.String, java.util.List, p.ibk):java.lang.Object");
    }

    @Override // p204p.hgm
    public final void shutdown() {
        kk40.m56680v(this.f224934t, null);
        this.f224933i.clear();
        try {
            pxy.m71562V(new File(this.f224927c.f223165a.getCacheDir(), "campfire_media_upload"));
        } catch (Exception e) {
            m6b.m60995j("Failed to clean up output directories: ", e.getMessage());
        }
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
