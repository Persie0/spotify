package p204p;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.externalintegration.http.ExternalAccessoryDescriptionModel;
import com.spotify.externalintegration.http.ExternalIntegrationRequestModel;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class hr81 implements jjw0, Function, zd10, eo91, u8z0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94374a;

    /* JADX INFO: renamed from: b */
    public int f94375b;

    /* JADX INFO: renamed from: c */
    public Object f94376c;

    /* JADX INFO: renamed from: d */
    public Object f94377d;

    /* JADX INFO: renamed from: e */
    public Object f94378e;

    /* JADX INFO: renamed from: f */
    public Object f94379f;

    public /* synthetic */ hr81(int i, byte b) {
        this.f94374a = i;
    }

    /* JADX INFO: renamed from: q */
    public static void m48329q(hr81 hr81Var, String str, Object obj) {
        HashMap map = (HashMap) hr81Var.f94378e;
        String string = obj != null ? obj.toString() : null;
        if (string == null) {
            string = "";
        }
        map.put(str, string);
    }

    /* JADX INFO: renamed from: A */
    public synchronized void m48330A() {
        try {
            if (((ArrayDeque) this.f94379f).isEmpty()) {
                txb1 txb1Var = (txb1) this.f94378e;
                be10 be10Var = (be10) this.f94377d;
                Objects.requireNonNull(be10Var);
                txb1Var.m81905f(new ijc(be10Var, 1), true);
            } else {
                ((ArrayDeque) this.f94379f).add(new wo71(ce10.f36989e, Long.MIN_VALUE));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0141  */
    @Override // p204p.u8z0
    /* JADX INFO: renamed from: a */
    public void mo36099a(l2n0 l2n0Var) {
        qu71 qu71Var;
        qu71 qu71Var2;
        SparseArray sparseArray;
        int i;
        ohc ohcVar;
        char c;
        SparseArray sparseArray2 = (SparseArray) this.f94377d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f94378e;
        ohc ohcVar2 = (ohc) this.f94376c;
        ml91 ml91Var = (ml91) this.f94379f;
        SparseArray sparseArray3 = ml91Var.f144786h;
        SparseBooleanArray sparseBooleanArray = ml91Var.f144787i;
        lfq lfqVar = ml91Var.f144784f;
        List list = ml91Var.f144781c;
        int i2 = ml91Var.f144779a;
        if (l2n0Var.m57917E() == 2) {
            if (i2 == 1 || i2 == 2 || ml91Var.f144792n == 1) {
                qu71Var = (qu71) list.get(0);
            } else {
                qu71Var = new qu71(((qu71) list.get(0)).m73881d());
                list.add(qu71Var);
            }
            if ((l2n0Var.m57917E() & 128) != 0) {
                l2n0Var.m57931S(1);
                int iM57924L = l2n0Var.m57924L();
                l2n0Var.m57931S(3);
                l2n0Var.m57943o(0, ohcVar2.f165389b, 2);
                ohcVar2.m66960m(0);
                ohcVar2.m66962o(3);
                ml91Var.f144798t = ohcVar2.m66954g(13);
                l2n0Var.m57943o(0, ohcVar2.f165389b, 2);
                ohcVar2.m66960m(0);
                ohcVar2.m66962o(4);
                l2n0Var.m57931S(ohcVar2.m66954g(12));
                if (i2 == 2 && ml91Var.f144796r == null) {
                    ol91 ol91VarM58908d = lfqVar.m58908d(21, new t0h1(21, (String) null, 0, (ArrayList) null, h0b1.f86201b));
                    ml91Var.f144796r = ol91VarM58908d;
                    if (ol91VarM58908d != null) {
                        ol91VarM58908d.mo67282b(qu71Var, ml91Var.f144791m, new zmx0(iM57924L, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int iM57932a = l2n0Var.m57932a();
                while (iM57932a > 0) {
                    l2n0Var.m57943o(0, ohcVar2.f165389b, 5);
                    ohcVar2.m66960m(0);
                    int iM66954g = ohcVar2.m66954g(8);
                    ohcVar2.m66962o(3);
                    int iM66954g2 = ohcVar2.m66954g(13);
                    ohcVar2.m66962o(4);
                    int iM66954g3 = ohcVar2.m66954g(12);
                    int i3 = l2n0Var.f129055b;
                    int i4 = i3 + iM66954g3;
                    int i5 = -1;
                    String strTrim = null;
                    ArrayList arrayList = null;
                    int iM57917E = 0;
                    int i6 = iM57932a;
                    while (true) {
                        if (l2n0Var.f129055b >= i4) {
                            ohcVar = ohcVar2;
                            break;
                        }
                        int iM57917E2 = l2n0Var.m57917E();
                        ohcVar = ohcVar2;
                        int iM57917E3 = l2n0Var.f129055b + l2n0Var.m57917E();
                        if (iM57917E3 > i4) {
                            break;
                        }
                        SparseArray sparseArray4 = sparseArray3;
                        if (iM57917E2 == 5) {
                            long jM57919G = l2n0Var.m57919G();
                            if (jM57919G == 1094921523) {
                                i5 = 129;
                            } else if (jM57919G == 1161904947) {
                                i5 = 135;
                            } else if (jM57919G == 1094921524) {
                                i5 = 172;
                            } else if (jM57919G == 1212503619) {
                                i5 = 36;
                            }
                        } else if (iM57917E2 == 106) {
                            iM57917E3 = iM57917E3;
                            i5 = 129;
                        } else if (iM57917E2 == 122) {
                            i5 = 135;
                            iM57917E3 = iM57917E3;
                        } else if (iM57917E2 == 127) {
                            int iM57917E4 = l2n0Var.m57917E();
                            if (iM57917E4 == 21) {
                                i5 = 172;
                            } else if (iM57917E4 == 14) {
                                i5 = 136;
                            } else if (iM57917E4 == 33) {
                                i5 = 139;
                            }
                        } else if (iM57917E2 == 123) {
                            i5 = 138;
                        } else if (iM57917E2 == 10) {
                            strTrim = l2n0Var.m57915C(3, StandardCharsets.UTF_8).trim();
                            iM57917E = l2n0Var.m57917E();
                        } else if (iM57917E2 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (l2n0Var.f129055b < iM57917E3) {
                                String strTrim2 = l2n0Var.m57915C(3, StandardCharsets.UTF_8).trim();
                                l2n0Var.m57917E();
                                qu71 qu71Var3 = qu71Var;
                                byte[] bArr = new byte[4];
                                l2n0Var.m57943o(0, bArr, 4);
                                arrayList2.add(new nl91(strTrim2, bArr));
                                qu71Var = qu71Var3;
                                iM57917E3 = iM57917E3;
                                iM57924L = iM57924L;
                            }
                            iM57917E3 = iM57917E3;
                            iM57924L = iM57924L;
                            qu71Var = qu71Var;
                            arrayList = arrayList2;
                            i5 = 89;
                        } else {
                            iM57917E3 = iM57917E3;
                            iM57924L = iM57924L;
                            qu71Var = qu71Var;
                            if (iM57917E2 == 111) {
                                i5 = 257;
                            }
                        }
                        l2n0Var.m57931S(iM57917E3 - l2n0Var.f129055b);
                        qu71Var = qu71Var;
                        ohcVar2 = ohcVar;
                        sparseArray3 = sparseArray4;
                        iM57924L = iM57924L;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i7 = iM57924L;
                    qu71 qu71Var4 = qu71Var;
                    l2n0Var.m57930R(i4);
                    t0h1 t0h1Var = new t0h1(i5, strTrim, iM57917E, arrayList, Arrays.copyOfRange(l2n0Var.f129054a, i3, i4));
                    if (iM66954g == 6 || iM66954g == 5) {
                        iM66954g = i5;
                    }
                    int i8 = i6 - (iM66954g3 + 5);
                    int i9 = i2 == 2 ? iM66954g : iM66954g2;
                    if (sparseBooleanArray.get(i9)) {
                        c = 21;
                    } else {
                        c = 21;
                        ol91 ol91VarM58908d2 = (i2 == 2 && iM66954g == 21) ? ml91Var.f144796r : lfqVar.m58908d(iM66954g, t0h1Var);
                        if (i2 != 2 || iM66954g2 < sparseIntArray.get(i9, 8192)) {
                            sparseIntArray.put(i9, iM66954g2);
                            sparseArray2.put(i9, ol91VarM58908d2);
                        }
                    }
                    iM57932a = i8;
                    qu71Var = qu71Var4;
                    ohcVar2 = ohcVar;
                    sparseArray3 = sparseArray5;
                    iM57924L = i7;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i10 = iM57924L;
                qu71 qu71Var5 = qu71Var;
                int size = sparseIntArray.size();
                int i11 = 0;
                while (i11 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i11);
                    int iValueAt = sparseIntArray.valueAt(i11);
                    sparseBooleanArray.put(iKeyAt, true);
                    ml91Var.f144788j.put(iValueAt, true);
                    ol91 ol91Var = (ol91) sparseArray2.valueAt(i11);
                    if (ol91Var != null) {
                        if (ol91Var != ml91Var.f144796r) {
                            i = i10;
                            qu71Var2 = qu71Var5;
                            ol91Var.mo67282b(qu71Var2, ml91Var.f144791m, new zmx0(i, iKeyAt, 8192));
                        } else {
                            qu71Var2 = qu71Var5;
                            i = i10;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(iValueAt, ol91Var);
                    } else {
                        qu71Var2 = qu71Var5;
                        sparseArray = sparseArray6;
                        i = i10;
                    }
                    i11++;
                    sparseArray6 = sparseArray;
                    i10 = i;
                    qu71Var5 = qu71Var2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i2 == 2) {
                    if (ml91Var.f144793o) {
                        return;
                    }
                    ml91Var.f144791m.mo37836t();
                    ml91Var.f144792n = 0;
                    ml91Var.f144793o = true;
                    return;
                }
                sparseArray7.remove(this.f94375b);
                int i12 = i2 == 1 ? 0 : ml91Var.f144792n - 1;
                ml91Var.f144792n = i12;
                if (i12 == 0) {
                    ml91Var.f144791m.mo37836t();
                    ml91Var.f144793o = true;
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean z;
        boolean zContains;
        String str;
        switch (this.f94374a) {
            case 5:
                prt0 prt0Var = (prt0) obj;
                List list = (List) this.f94376c;
                boolean z2 = prt0Var.f180666a;
                Set set = prt0Var.f180676k;
                if (z2 && !set.isEmpty()) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ContextTrack contextTrack = (ContextTrack) it.next();
                                if (e72.m37992Z(contextTrack) || bm51.m29803n0(contextTrack.uri(), "spotify:kallax:", false)) {
                                    zContains = set.contains(ort0.f168653c);
                                } else {
                                    zContains = (e72.m37986T(contextTrack) || e72.m37978L(contextTrack)) ? set.contains(ort0.f168654d) : true;
                                }
                                if (!zContains) {
                                    z = false;
                                }
                            }
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Single singleJust = Single.just(qu1.f192538c);
                    wj50.m88279p(singleJust);
                    return singleJust;
                }
                a9p a9pVar = (a9p) this.f94377d;
                return a9pVar.f13616a.f115322c.m23327A().flatMap(new z8p(list, this.f94375b, prt0Var.f180667b == 2, (String) this.f94378e, (String) this.f94379f, a9pVar)).map(l6q.f130440S0);
            case 12:
                return new c0k((String) this.f94376c, (String) this.f94377d, this.f94375b, (xt80) ((xul0) this.f94378e).mo49283h(), (wv11) obj, (p8y0) this.f94379f);
            default:
                yk91 yk91Var = (yk91) obj;
                jyx jyxVar = (jyx) this.f94379f;
                iun0 iun0Var = (iun0) this.f94378e;
                Boolean bool = (Boolean) yk91Var.f273651b;
                Map<String, String> map = (Map) yk91Var.f273652c;
                ExternalAccessoryDescription externalAccessoryDescription = (ExternalAccessoryDescription) this.f94376c;
                ExternalAccessoryDescriptionModel externalAccessoryDescriptionModel = new ExternalAccessoryDescriptionModel(externalAccessoryDescription.integrationType, externalAccessoryDescription.p.kyx.b java.lang.String, externalAccessoryDescription.name, externalAccessoryDescription.p.kyx.d java.lang.String, externalAccessoryDescription.p.kyx.c java.lang.String, externalAccessoryDescription.company, externalAccessoryDescription.model, externalAccessoryDescription.version, externalAccessoryDescription.p.kyx.e java.lang.String, externalAccessoryDescription.senderId);
                int i = this.f94375b;
                if (i == 0) {
                    str = null;
                } else if (i == 1) {
                    str = "1d";
                } else {
                    if (i != 2) {
                        throw null;
                    }
                    str = "2d";
                }
                ExternalIntegrationRequestModel externalIntegrationRequestModel = new ExternalIntegrationRequestModel(externalAccessoryDescriptionModel, lau.f131415a, str, ((roa) this.f94377d).f201211n, bool);
                wj50.m88279p(jyxVar);
                return jyxVar.m54821a(map, zno.m96593a(Calendar.getInstance()), nyx.m65912a(externalIntegrationRequestModel)).map(jey.f111732Y0).toObservable().onErrorResumeNext(new hun0(map, iun0Var, jyxVar, externalIntegrationRequestModel, 0));
        }
    }

    @Override // p204p.jjw0
    /* JADX INFO: renamed from: c */
    public void mo37292c() {
        ((kqi0) this.f94376c).setValue(Boolean.TRUE);
    }

    @Override // p204p.eo91
    /* JADX INFO: renamed from: d */
    public bo91 mo39549d(zov0 zov0Var) {
        hu70 hu70Var = (hu70) ((nwo) this.f94379f).invoke(zov0Var);
        return hu70Var != null ? hu70Var : ((eo91) ((z9t) this.f94376c).f280874c).mo39549d(zov0Var);
    }

    /* JADX INFO: renamed from: e */
    public void m48331e(ctj0 ctj0Var) {
        IconCompat iconCompatM33845a = ctj0Var.m33845a();
        boolean z = ctj0Var.f41897d;
        Bundle bundle = ctj0Var.f41894a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatM33845a != null ? x5i0.m90019G(iconCompatM33845a, null) : null, ctj0Var.f41900g, ctj0Var.f41901h);
        tdw0[] tdw0VarArr = ctj0Var.f41896c;
        if (tdw0VarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[tdw0VarArr.length];
            if (tdw0VarArr.length > 0) {
                tdw0 tdw0Var = tdw0VarArr[0];
                throw null;
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        int i = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z);
        bundle2.putInt("android.support.action.semanticAction", 0);
        if (i >= 28) {
            r35.m74590T(builder);
        }
        if (i >= 29) {
            lzj.m60356d0(builder);
        }
        if (i >= 31) {
            k04.m54895B(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", ctj0Var.f41898e);
        builder.addExtras(bundle2);
        ((Notification.Builder) this.f94377d).addAction(builder.build());
    }

    @Override // p204p.jjw0
    /* JADX INFO: renamed from: f */
    public void mo37294f() {
        ((kqi0) this.f94376c).setValue(Boolean.FALSE);
    }

    @Override // p204p.jjw0
    /* JADX INFO: renamed from: g */
    public void mo37295g(boolean z) {
        ((kqi0) this.f94376c).setValue(Boolean.FALSE);
        ((kqi0) this.f94379f).setValue(Boolean.valueOf(!z));
        if (z) {
            ((gh00) this.f94377d).invoke(new dh1(this.f94375b, ((ubl0) this.f94378e).f228817a));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m48332h(double d, float f) {
        int length = ((float[]) this.f94376c).length + 1;
        int iBinarySearch = Arrays.binarySearch((double[]) this.f94377d, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f94377d = Arrays.copyOf((double[]) this.f94377d, length);
        this.f94376c = Arrays.copyOf((float[]) this.f94376c, length);
        this.f94378e = new double[length];
        double[] dArr = (double[]) this.f94377d;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        ((double[]) this.f94377d)[iBinarySearch] = d;
        ((float[]) this.f94376c)[iBinarySearch] = f;
    }

    /* JADX INFO: renamed from: i */
    public e18 m48333i() {
        return new e18((String) this.f94376c, (String) this.f94377d, (String) this.f94378e, (s28) this.f94379f, this.f94375b);
    }

    /* JADX INFO: renamed from: j */
    public ut91 m48334j() {
        String str = (String) this.f94376c;
        ofg1.m66846o(str, "action name");
        int i = this.f94375b;
        String str2 = (String) this.f94377d;
        ofg1.m66846o(str2, "interaction type");
        return new ut91(str, i, str2, (HashMap) this.f94378e, (ArrayList) this.f94379f);
    }

    /* JADX INFO: renamed from: k */
    public EncoreTextView m48335k(int i) {
        EncoreTextView encoreTextView = new EncoreTextView((Activity) this.f94376c, null, 0, 6, null);
        encoreTextView.setTextAppearance(R.style.TextAppearance_Encore_BodySmall);
        encoreTextView.setTextColor(vtg1.m86387n(encoreTextView, R.attr.baseTextSubdued));
        int dimensionPixelSize = encoreTextView.getContext().getResources().getDimensionPixelSize(R.dimen.bulletpoint_gap_width);
        SpannableString spannableString = new SpannableString(encoreTextView.getContext().getString(i));
        spannableString.setSpan(new BulletSpan(dimensionPixelSize), 0, spannableString.length(), 33);
        encoreTextView.setText(spannableString);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        marginLayoutParams.topMargin = encoreTextView.getContext().getResources().getDimensionPixelSize(R.dimen.bulletpoint_top_margin);
        encoreTextView.setLayoutParams(marginLayoutParams);
        return encoreTextView;
    }

    /* JADX INFO: renamed from: l */
    public EncoreTextView m48336l(int i) {
        EncoreTextView encoreTextView = new EncoreTextView((Activity) this.f94376c, null, 0, 6, null);
        encoreTextView.setTextAppearance(R.style.TextAppearance_Encore_BodyMediumBold);
        encoreTextView.setTextColor(vtg1.m86387n(encoreTextView, R.attr.baseTextBase));
        encoreTextView.setText(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = encoreTextView.getContext().getResources().getDimensionPixelSize(R.dimen.section_top_margin);
        encoreTextView.setLayoutParams(marginLayoutParams);
        return encoreTextView;
    }

    /* JADX INFO: renamed from: m */
    public xjf0 m48337m() {
        xz20 xz20Var;
        return (this.f94375b == 0 || (xz20Var = (xz20) this.f94379f) == null) ? new xjf0() : new xjf0(xz20Var.f267511a, (String) this.f94376c, !((ArrayDeque) this.f94377d).isEmpty(), !((ArrayDeque) this.f94378e).isEmpty());
    }

    /* JADX INFO: renamed from: n */
    public String m48338n(String str) {
        HashMap map = (HashMap) this.f94377d;
        if (!map.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) map.get(str)) {
            Iterator it = ((ArrayList) this.f94378e).iterator();
            while (it.hasNext()) {
                gfb implementation = ((gfb) it.next()).getImplementation();
                wj50.m88275l("CameraInfo doesn't contain Camera2 implementation.", implementation instanceof ldb);
                if (str2.equals(((ldb) ((ldb) implementation).f132128c.f105467b).f132126a)) {
                    return str2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public boolean m48339o(hr81 hr81Var, int i) {
        return hr81Var != null && Objects.equals(((qkw0[]) this.f94376c)[i], ((qkw0[]) hr81Var.f94376c)[i]) && Objects.equals(((xjx[]) this.f94377d)[i], ((xjx[]) hr81Var.f94377d)[i]);
    }

    @Override // p204p.zd10
    public synchronized void onFlush() {
        this.f94375b = 0;
        ((ArrayDeque) this.f94379f).clear();
    }

    /* JADX INFO: renamed from: p */
    public boolean m48340p(int i) {
        return ((qkw0[]) this.f94376c)[i] != null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX INFO: renamed from: r */
    public void m48341r(Intent intent) {
        el40 el40Var = new el40(4, this, intent);
        li4 li4Var = (li4) this.f94378e;
        if (li4Var.m59024a() <= 0) {
            el40Var.invoke();
            return;
        }
        Intent intent2 = (Intent) this.f94379f;
        if (intent2 != null && wj50.m88271j(intent2.getAction(), intent.getAction()) && wj50.m88271j(intent2.getData(), intent.getData())) {
            Bundle extras = intent2.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                extras2 = new Bundle();
            }
            if (!g9g1.m44038n(extras, extras2) || g6f.m43725i0(h6f.m46715L("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI", "com.spotify.mobile.android.ui.action.view.CLEAR_BACKSTACK", "com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS"), intent2.getAction())) {
                this.f94375b = 0;
            } else {
                this.f94375b++;
            }
        } else {
            this.f94375b = 0;
        }
        this.f94379f = intent;
        if (this.f94375b < li4Var.m59024a()) {
            el40Var.invoke();
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m48342s(final ce10 ce10Var, final long j) {
        try {
            if (this.f94375b > 0) {
                ((txb1) this.f94378e).m81905f(new sxb1() { // from class: p.f900
                    @Override // p204p.sxb1
                    public final void run() {
                        hr81 hr81Var = this.f67137a;
                        ((be10) hr81Var.f94377d).mo28867g((ud10) hr81Var.f94376c, ce10Var, j);
                    }
                }, true);
                this.f94375b--;
            } else {
                ((ArrayDeque) this.f94379f).add(new wo71(ce10Var, j));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m48343t(s28 s28Var) {
        this.f94379f = s28Var;
    }

    public String toString() {
        String str;
        String str2;
        switch (this.f94374a) {
            case 13:
                return "pos =" + Arrays.toString((double[]) this.f94377d) + " period=" + Arrays.toString((float[]) this.f94376c);
            case 19:
                String str3 = (String) this.f94379f;
                StringBuilder sb = new StringBuilder("since ");
                sb.append((beb1) this.f94376c);
                sb.append(' ');
                int i = this.f94375b;
                if (i == 1) {
                    str = "WARNING";
                } else if (i != 2) {
                    str = i != 3 ? "null" : "HIDDEN";
                } else {
                    str = SearchEndpointResponseKt.RESULT_ERROR;
                }
                sb.append(str);
                Integer num = (Integer) this.f94378e;
                if (num != null) {
                    str2 = " error " + num.intValue();
                } else {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(str3 != null ? ": ".concat(str3) : "");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m48344u(String str) {
        this.f94377d = str;
    }

    @Override // p204p.zd10
    /* JADX INFO: renamed from: w */
    public synchronized void mo34259w() {
        wo71 wo71Var = (wo71) ((ArrayDeque) this.f94379f).poll();
        if (wo71Var == null) {
            this.f94375b++;
            return;
        }
        ((txb1) this.f94378e).m81905f(new hjc(4, this, wo71Var), true);
        wo71 wo71Var2 = (wo71) ((ArrayDeque) this.f94379f).peek();
        if (wo71Var2 != null && wo71Var2.f253397b == Long.MIN_VALUE) {
            txb1 txb1Var = (txb1) this.f94378e;
            be10 be10Var = (be10) this.f94377d;
            Objects.requireNonNull(be10Var);
            txb1Var.m81905f(new ijc(be10Var, 1), true);
            ((ArrayDeque) this.f94379f).remove();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m48345x(String str) {
        this.f94378e = str;
    }

    /* JADX INFO: renamed from: y */
    public void m48346y(int i) {
        this.f94375b = i;
    }

    /* JADX INFO: renamed from: z */
    public void m48347z(String str) {
        this.f94376c = str;
    }

    public hr81(ExternalAccessoryDescription externalAccessoryDescription, int i, roa roaVar, iun0 iun0Var, jyx jyxVar) {
        this.f94374a = 14;
        this.f94376c = externalAccessoryDescription;
        this.f94375b = i;
        this.f94377d = roaVar;
        this.f94378e = iun0Var;
        this.f94379f = jyxVar;
    }

    public /* synthetic */ hr81(Object obj, Object obj2, int i, Serializable serializable, Object obj3, int i2) {
        this.f94374a = i2;
        this.f94376c = obj;
        this.f94377d = obj2;
        this.f94375b = i;
        this.f94378e = serializable;
        this.f94379f = obj3;
    }

    public /* synthetic */ hr81(Object obj, Object obj2, Object obj3, int i) {
        this.f94374a = i;
        this.f94376c = obj;
        this.f94377d = obj2;
        this.f94378e = obj3;
    }

    public /* synthetic */ hr81(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f94374a = i2;
        this.f94376c = obj;
        this.f94377d = obj2;
        this.f94378e = obj3;
        this.f94379f = obj4;
        this.f94375b = i;
    }

    public hr81(RecyclerView recyclerView, thq thqVar, thq thqVar2) {
        int dimensionPixelSize;
        this.f94374a = 20;
        this.f94376c = recyclerView;
        this.f94377d = new bsa(recyclerView, thqVar, thqVar2);
        this.f94378e = new abs0(recyclerView, new r0c1(this, 26));
        if (e0b1.m37490b(recyclerView.getContext())) {
            dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.tablet_carousel_horizontal_spacing);
        } else {
            dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.carousel_horizontal_spacing);
        }
        this.f94375b = dimensionPixelSize;
        Context context = recyclerView.getContext();
        qr8 qr8Var = new qr8();
        qr8Var.f191759a = dimensionPixelSize;
        qr8Var.f191760b = context.getResources().getDimensionPixelSize(R.dimen.carousel_max_card_width);
        this.f94379f = qr8Var;
    }

    public hr81(Locale locale, yre yreVar) {
        hf71 hf71Var;
        this.f94374a = 4;
        this.f94376c = locale;
        this.f94377d = yreVar;
        this.f94375b = upd1.m83655b(locale).f232641a.m51215f();
        ioo[] iooVarArrValues = ioo.values();
        ArrayList arrayList = new ArrayList(iooVarArrValues.length);
        int length = iooVarArrValues.length;
        int i = 0;
        while (true) {
            hf71Var = hf71.f90618b;
            if (i >= length) {
                break;
            }
            ioo iooVar = iooVarArrValues[i];
            arrayList.add(new pqm0(iooVar.m51214a(hf71Var, (Locale) this.f94376c), iooVar.m51214a(hf71.f90622f, (Locale) this.f94376c)));
            i++;
        }
        this.f94378e = arrayList;
        eyh0[] eyh0VarArrValues = eyh0.values();
        ArrayList arrayList2 = new ArrayList(eyh0VarArrValues.length);
        for (eyh0 eyh0Var : eyh0VarArrValues) {
            arrayList2.add(eyh0Var.m40313f(hf71Var, (Locale) this.f94376c));
        }
        this.f94379f = arrayList2;
    }

    public hr81(int i) {
        this.f94374a = 10;
        String string = UUID.randomUUID().toString();
        this.f94375b = i;
        this.f94376c = string;
        this.f94377d = new ArrayDeque();
        this.f94378e = new ArrayDeque();
        if (i < 0) {
            throw new IllegalArgumentException("History capacity cannot be negative");
        }
    }

    public hr81(Activity activity, kv91 kv91Var, int i) {
        this.f94374a = 6;
        this.f94376c = activity;
        this.f94377d = kv91Var;
        this.f94375b = i;
        st91 st91Var = st91.f213865b;
        this.f94378e = new bbg0(15);
        this.f94379f = new wg61(new edq(this, 19));
    }

    public hr81(z9t z9tVar, qqo qqoVar, ce60 ce60Var, int i) {
        this.f94374a = 9;
        this.f94376c = z9tVar;
        this.f94377d = qqoVar;
        this.f94375b = i;
        ArrayList typeParameters = ce60Var.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.f94378e = linkedHashMap;
        this.f94379f = ((bna0) ((y751) ((qwm) ((z9t) this.f94376c).f280873b).f193363a)).m29938c(new jt70(this, 3));
    }

    public hr81(ud10 ud10Var, be10 be10Var, txb1 txb1Var) {
        this.f94374a = 7;
        this.f94376c = ud10Var;
        this.f94377d = be10Var;
        this.f94378e = txb1Var;
        this.f94379f = new ArrayDeque();
    }

    public hr81(yfb yfbVar) {
        this.f94374a = 3;
        this.f94375b = 0;
        HashMap map = new HashMap();
        this.f94377d = map;
        this.f94379f = new HashSet();
        this.f94376c = new ArrayList();
        this.f94378e = new ArrayList();
        Set hashSet = new HashSet();
        try {
            hashSet = yfbVar.f272197a.mo29106z();
        } catch (CameraAccessExceptionCompat unused) {
            vie1.m85626h("Camera2CameraCoordinator");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (jq60.m54076v(str, yfbVar) && jq60.m54076v(str2, yfbVar)) {
                        ((HashSet) this.f94379f).add(new HashSet(Arrays.asList(str, str2)));
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        ((List) map.get(str)).add((String) arrayList.get(1));
                        ((List) map.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (InitializationException unused2) {
                    vie1.m85624f("Camera2CameraCoordinator");
                }
            }
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.validateException(MethodThrowsVisitor.java:228)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.isThrowsRequired(MethodThrowsVisitor.java:216)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visitThrows(MethodThrowsVisitor.java:204)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:155)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r10v13, types: [android.os.Parcelable[]] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v26, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v31, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r9v31, types: [android.os.Bundle] */
    public hr81(ktj0 ktj0Var) {
        CharSequence[] charSequenceArr;
        int i;
        Bundle bundle;
        ?? r10;
        ArrayList arrayList;
        ctj0 ctj0VarM70979f;
        ctj0 ctj0VarM70979f2;
        this.f94374a = 11;
        new ArrayList();
        this.f94379f = new Bundle();
        this.f94378e = ktj0Var;
        Context context = ktj0Var.f126310a;
        ArrayList arrayList2 = ktj0Var.f126309F;
        ArrayList<nsn0> arrayList3 = ktj0Var.f126312c;
        ArrayList arrayList4 = ktj0Var.f126313d;
        this.f94376c = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f94377d = c150.m31234p(context, ktj0Var.f126334y);
        } else {
            this.f94377d = new Notification.Builder(context);
        }
        Notification notification = ktj0Var.f126307D;
        CharSequence[] charSequenceArr2 = null;
        int i2 = 2;
        int i3 = 0;
        ((Notification.Builder) this.f94377d).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(ktj0Var.f126314e).setContentText(ktj0Var.f126315f).setContentInfo(null).setContentIntent(ktj0Var.f126316g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(ktj0Var.f126318i).setProgress(ktj0Var.f126323n, ktj0Var.f126324o, ktj0Var.f126325p);
        Notification.Builder builder = (Notification.Builder) this.f94377d;
        IconCompat iconCompat = ktj0Var.f126317h;
        builder.setLargeIcon(iconCompat == null ? null : x5i0.m90019G(iconCompat, context));
        ((Notification.Builder) this.f94377d).setSubText(ktj0Var.f126322m).setUsesChronometer(false).setPriority(ktj0Var.f126319j);
        euj0 euj0Var = ktj0Var.f126321l;
        if (euj0Var instanceof ptj0) {
            ptj0 ptj0Var = (ptj0) euj0Var;
            PendingIntent pendingIntent = ptj0Var.f181180h;
            if (pendingIntent == null) {
                ctj0VarM70979f = ptj0Var.m70979f(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, ptj0Var.f181184l, R.color.call_notification_decline_color, ptj0Var.f181181i);
            } else {
                ctj0VarM70979f = ptj0Var.m70979f(R.drawable.ic_call_decline, R.string.call_notification_decline_action, ptj0Var.f181184l, R.color.call_notification_decline_color, pendingIntent);
            }
            PendingIntent pendingIntent2 = ptj0Var.f181179g;
            if (pendingIntent2 == null) {
                ctj0VarM70979f2 = null;
            } else {
                boolean z = ptj0Var.f181182j;
                ctj0VarM70979f2 = ptj0Var.m70979f(z ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, ptj0Var.f181183k, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(ctj0VarM70979f);
            ArrayList<ctj0> arrayList6 = ptj0Var.f62989a.f126311b;
            if (arrayList6 != null) {
                for (ctj0 ctj0Var : arrayList6) {
                    ctj0Var.getClass();
                    if (!ctj0Var.f41894a.getBoolean("key_action_priority")) {
                        arrayList5.add(ctj0Var);
                        i2--;
                    }
                    if (ctj0VarM70979f2 != null && i2 == 1) {
                        arrayList5.add(ctj0VarM70979f2);
                        i2--;
                    }
                }
            }
            if (ctj0VarM70979f2 != null && i2 >= 1) {
                arrayList5.add(ctj0VarM70979f2);
            }
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                m48331e((ctj0) it.next());
            }
        } else {
            Iterator it2 = ktj0Var.f126311b.iterator();
            while (it2.hasNext()) {
                m48331e((ctj0) it2.next());
            }
        }
        Bundle bundle2 = ktj0Var.f126329t;
        if (bundle2 != null) {
            ((Bundle) this.f94379f).putAll(bundle2);
        }
        int i4 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f94377d).setShowWhen(ktj0Var.f126320k);
        ((Notification.Builder) this.f94377d).setLocalOnly(ktj0Var.f126327r);
        ((Notification.Builder) this.f94377d).setGroup(ktj0Var.f126326q);
        ((Notification.Builder) this.f94377d).setSortKey(null);
        ((Notification.Builder) this.f94377d).setGroupSummary(false);
        this.f94375b = 0;
        ((Notification.Builder) this.f94377d).setCategory(ktj0Var.f126328s);
        ((Notification.Builder) this.f94377d).setColor(ktj0Var.f126330u);
        ((Notification.Builder) this.f94377d).setVisibility(ktj0Var.f126331v);
        ((Notification.Builder) this.f94377d).setPublicVersion(null);
        ((Notification.Builder) this.f94377d).setSound(notification.sound, notification.audioAttributes);
        if (i4 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                for (nsn0 nsn0Var : arrayList3) {
                    CharSequence charSequence = nsn0Var.f157848a;
                    String str = nsn0Var.f157850c;
                    if (str == null) {
                        str = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList.add(str);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    zj5 zj5Var = new zj5(arrayList2.size() + arrayList.size());
                    zj5Var.addAll(arrayList);
                    zj5Var.addAll(arrayList2);
                    arrayList2 = new ArrayList(zj5Var);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((Notification.Builder) this.f94377d).addPerson((String) it3.next());
            }
        }
        if (arrayList4.size() > 0) {
            if (ktj0Var.f126329t == null) {
                ktj0Var.f126329t = new Bundle();
            }
            Bundle bundle3 = ktj0Var.f126329t.getBundle("android.car.EXTENSIONS");
            ?? bundle4 = bundle3 == null ? new Bundle() : bundle3;
            ?? bundle5 = new Bundle((Bundle) bundle4);
            ?? bundle6 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList4.size()) {
                String string = Integer.toString(i5);
                ctj0 ctj0Var2 = (ctj0) arrayList4.get(i5);
                ?? bundle7 = new Bundle();
                IconCompat iconCompatM33845a = ctj0Var2.m33845a();
                Bundle bundle8 = ctj0Var2.f41894a;
                bundle7.putInt("icon", iconCompatM33845a != null ? iconCompatM33845a.m394h() : i3);
                bundle7.putCharSequence(ContextTrack.Metadata.KEY_TITLE, ctj0Var2.f41900g);
                bundle7.putParcelable("actionIntent", ctj0Var2.f41901h);
                if (bundle8 != null) {
                    bundle = new Bundle(bundle8);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", ctj0Var2.f41897d);
                bundle7.putBundle("extras", bundle);
                tdw0[] tdw0VarArr = ctj0Var2.f41896c;
                if (tdw0VarArr == null) {
                    r10 = charSequenceArr2;
                } else {
                    r10 = new Bundle[tdw0VarArr.length];
                    if (tdw0VarArr.length > 0) {
                        tdw0 tdw0Var = tdw0VarArr[0];
                        new Bundle();
                        throw charSequenceArr2;
                    }
                }
                bundle7.putParcelableArray("remoteInputs", r10);
                bundle7.putBoolean("showsUserInterface", ctj0Var2.f41898e);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i5++;
                i3 = 0;
                charSequenceArr2 = charSequenceArr2;
            }
            charSequenceArr = charSequenceArr2;
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (ktj0Var.f126329t == null) {
                ktj0Var.f126329t = new Bundle();
            }
            ktj0Var.f126329t.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f94379f).putBundle("android.car.EXTENSIONS", bundle5);
        } else {
            charSequenceArr = null;
        }
        int i6 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f94377d).setExtras(ktj0Var.f126329t);
        ((Notification.Builder) this.f94377d).setRemoteInputHistory(charSequenceArr);
        RemoteViews remoteViews = ktj0Var.f126332w;
        if (remoteViews != null) {
            ((Notification.Builder) this.f94377d).setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = ktj0Var.f126333x;
        if (remoteViews2 != null) {
            ((Notification.Builder) this.f94377d).setCustomBigContentView(remoteViews2);
        }
        if (i6 >= 26) {
            c150.m31212F((Notification.Builder) this.f94377d);
            c150.m31216J((Notification.Builder) this.f94377d);
            c150.m31217K((Notification.Builder) this.f94377d, ktj0Var.f126335z);
            c150.m31218L((Notification.Builder) this.f94377d, ktj0Var.f126304A);
            c150.m31214H((Notification.Builder) this.f94377d, 0);
            if (!TextUtils.isEmpty(ktj0Var.f126334y)) {
                ((Notification.Builder) this.f94377d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i6 >= 28) {
            for (nsn0 nsn0Var2 : arrayList3) {
                Notification.Builder builder2 = (Notification.Builder) this.f94377d;
                nsn0Var2.getClass();
                r35.m74595c(builder2, t35.m79963c(nsn0Var2));
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            lzj.m60348Z((Notification.Builder) this.f94377d, ktj0Var.f126306C);
            lzj.m60354c0((Notification.Builder) this.f94377d);
        }
        if (i7 >= 31 && (i = ktj0Var.f126305B) != 0) {
            k04.m54896C((Notification.Builder) this.f94377d, i);
        }
        if (i7 >= 36) {
            AbstractC2291qf.m72681f((Notification.Builder) this.f94377d);
        }
        if (ktj0Var.f126308E) {
            ((ktj0) this.f94378e).getClass();
            this.f94375b = 1;
            ((Notification.Builder) this.f94377d).setVibrate(null);
            ((Notification.Builder) this.f94377d).setSound(null);
            int i8 = notification.defaults & (-4);
            notification.defaults = i8;
            ((Notification.Builder) this.f94377d).setDefaults(i8);
            if (i7 >= 26) {
                if (TextUtils.isEmpty(((ktj0) this.f94378e).f126326q)) {
                    ((Notification.Builder) this.f94377d).setGroup("silent");
                }
                c150.m31214H((Notification.Builder) this.f94377d, 1);
            }
        }
    }

    @Override // p204p.u8z0
    /* JADX INFO: renamed from: b */
    public void mo36100b(qu71 qu71Var, e5y e5yVar, zmx0 zmx0Var) {
    }

    public hr81(qkw0[] qkw0VarArr, xjx[] xjxVarArr, tt81 tt81Var, Object obj) {
        this.f94374a = 0;
        c95.m31843i(qkw0VarArr.length == xjxVarArr.length);
        this.f94376c = qkw0VarArr;
        this.f94377d = (xjx[]) xjxVarArr.clone();
        this.f94378e = tt81Var;
        this.f94379f = obj;
        this.f94375b = qkw0VarArr.length;
    }

    public hr81(kqi0 kqi0Var, gh00 gh00Var, ubl0 ubl0Var, int i, kqi0 kqi0Var2) {
        this.f94374a = 1;
        this.f94376c = kqi0Var;
        this.f94377d = gh00Var;
        this.f94378e = ubl0Var;
        this.f94375b = i;
        this.f94379f = kqi0Var2;
    }

    public hr81(ml91 ml91Var, int i) {
        this.f94374a = 17;
        this.f94379f = ml91Var;
        this.f94376c = new ohc(new byte[5], 5);
        this.f94377d = new SparseArray();
        this.f94378e = new SparseIntArray();
        this.f94375b = i;
    }
}
