package p204p;

import android.content.Intent;
import android.media.CamcorderProfile;
import android.media.MediaDrmException;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import com.spotify.familyviewservice.p066v1.Allocation;
import com.spotify.familyviewservice.p066v1.GetMemberDetailsResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.share.logging.impl.events.proto.ShareDebugError;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes6.dex */
public final class sp5 implements kcb, jix, Function, Init, fum0, InterfaceC2207oa, w1j0, vd50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f212733a;

    public /* synthetic */ sp5(int i) {
        this.f212733a = i;
    }

    /* JADX INFO: renamed from: p */
    public static ShareDebugError m78852p(scg1 scg1Var) {
        so01 so01VarM21094q = ShareDebugError.m21094q();
        so01VarM21094q.m78604r("share.restrictions");
        so01VarM21094q.m78602m(4);
        so01VarM21094q.m78603q(((cpo) scg1Var).f40582e);
        return (ShareDebugError) so01VarM21094q.build();
    }

    /* JADX INFO: renamed from: s */
    public static Bundle m78853s(m3x m3xVar, View view, View view2) {
        Bundle bundle = new Bundle();
        if (m3xVar != null) {
            for (ctm0 ctm0Var : Collections.unmodifiableList(m3xVar.f139773c)) {
                String str = ctm0Var.f41920b;
                String str2 = ctm0Var.f41919a;
                ArrayList arrayList = ctm0Var.f41921c;
                if (str != null && str.length() > 0) {
                    bundle.putString(str2, ctm0Var.f41920b);
                } else if (arrayList.size() > 0) {
                    for (axe axeVar : wj50.m88271j(ctm0Var.f41922d, "relative") ? ybg1.m93276m(view2, arrayList, 0, -1, view2.getClass().getSimpleName()) : ybg1.m93276m(view, arrayList, 0, -1, view.getClass().getSimpleName())) {
                        if (axeVar.m27383a() != null) {
                            String strM83154j = uhc1.m83154j(axeVar.m27383a());
                            if (strM83154j.length() > 0) {
                                bundle.putString(str2, strM83154j);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: t */
    public static void m78854t(int i) {
        synchronized (UnmanagedSessionReceiver.f890a) {
            if (UnmanagedSessionReceiver.f891b.get(Integer.valueOf(i)) != null) {
                throw new ClassCastException();
            }
        }
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: a */
    public Map mo53475a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        u300 u300Var = ((ihi) obj).f102296c;
        return u300Var == u300.THIS_IS_ARTIST || u300Var == u300.EDITORIAL;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int iM10716p;
        switch (this.f212733a) {
            case 11:
                o2x0 o2x0Var = (o2x0) obj;
                n2x0 n2x0Var = o2x0Var.f161171a;
                if (!n2x0Var.f149852O0) {
                    int i = n2x0Var.f149860d;
                    if (500 <= i && i < 600) {
                        na6.m63957e("Received error code " + i + ", with body: " + o2x0Var.f161173c);
                    }
                    throw new HttpException(o2x0Var);
                }
                GetMemberDetailsResponse getMemberDetailsResponse = (GetMemberDetailsResponse) o2x0Var.f161172b;
                if (getMemberDetailsResponse == null || (iM10716p = getMemberDetailsResponse.m10716p()) == 0) {
                    throw new IllegalArgumentException("Account type is null");
                }
                int iM38547C = edb.m38547C(iM10716p);
                if (iM38547C != 0) {
                    if (iM38547C == 1) {
                        return new j4c0(getMemberDetailsResponse.getMemberId(), getMemberDetailsResponse.getPlanName(), getMemberDetailsResponse.m10717q(), getMemberDetailsResponse.m10718r(), getMemberDetailsResponse.m10714n().getChildId(), getMemberDetailsResponse.m10714n().m10697p().getDisplayName(), getMemberDetailsResponse.m10714n().m10697p().getImageUrl(), zby.m95881d(getMemberDetailsResponse.m10714n().m10697p()), getMemberDetailsResponse.m10714n().getAllowExplicitContent(), getMemberDetailsResponse.m10714n().hasAllowConnect() ? Boolean.valueOf(getMemberDetailsResponse.m10714n().getAllowConnect()) : null, getMemberDetailsResponse.m10714n().getAllowVideo(), getMemberDetailsResponse.m10714n().getDateOfBirth(), getMemberDetailsResponse.m10714n().getDateOfBirthMinDate(), getMemberDetailsResponse.m10714n().getDateOfBirthMaxDate(), getMemberDetailsResponse.m10714n().hasGraduationBanner() ? new as10(getMemberDetailsResponse.m10714n().m10696o().getMinGraduationAge()) : zr10.f285520a, getMemberDetailsResponse.m10714n().getIsExpiring());
                    }
                    if (iM38547C == 2) {
                        return new w380(getMemberDetailsResponse.getMemberId(), getMemberDetailsResponse.getPlanName(), getMemberDetailsResponse.m10717q(), getMemberDetailsResponse.m10718r(), getMemberDetailsResponse.m10715o().getChildId(), getMemberDetailsResponse.m10715o().m10746o().getDisplayName(), getMemberDetailsResponse.m10715o().m10746o().getImageUrl(), zby.m95881d(getMemberDetailsResponse.m10715o().m10746o()), getMemberDetailsResponse.m10715o().getIsExpiring());
                    }
                    if (iM38547C != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalArgumentException("Account type not supported");
                }
                String memberId = getMemberDetailsResponse.getMemberId();
                String planName = getMemberDetailsResponse.getPlanName();
                int iM10717q = getMemberDetailsResponse.m10717q();
                String strM10718r = getMemberDetailsResponse.m10718r();
                String username = getMemberDetailsResponse.m10719s().getUsername();
                String displayName = getMemberDetailsResponse.m10719s().m10777v().getDisplayName();
                String imageUrl = getMemberDetailsResponse.m10719s().m10777v().getImageUrl();
                int iM95881d = zby.m95881d(getMemberDetailsResponse.m10719s().m10777v());
                boolean zM10776u = getMemberDetailsResponse.m10719s().m10776u();
                boolean allowExplicitContent = getMemberDetailsResponse.m10719s().getAllowExplicitContent();
                boolean zM10775s = getMemberDetailsResponse.m10719s().m10775s();
                boolean zM10772p = getMemberDetailsResponse.m10719s().m10772p();
                boolean zM10774r = getMemberDetailsResponse.m10719s().m10774r();
                String strM10771o = getMemberDetailsResponse.m10719s().m10771o();
                ae50 ae50VarM10770n = getMemberDetailsResponse.m10719s().m10770n();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM10770n, 10));
                Iterator<E> it = ae50VarM10770n.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Allocation) it.next()).getName());
                }
                return new roz0(memberId, planName, iM10717q, strM10718r, username, displayName, imageUrl, iM95881d, zM10776u, allowExplicitContent, zM10775s, zM10772p, zM10774r, strM10771o, arrayList, getMemberDetailsResponse.m10719s().getIsExpiring(), getMemberDetailsResponse.m10719s().m10773q());
            case 19:
                qam0 qam0Var = (qam0) obj;
                tmm0 tmm0Var = qam0Var instanceof tmm0 ? (tmm0) qam0Var : null;
                return tmm0Var != null ? tmm0Var : qam0Var;
            case 23:
                ContextTrack contextTrack = (ContextTrack) obj;
                String strM38012j0 = e72.m38012j0(contextTrack);
                if (strM38012j0 == null) {
                    strM38012j0 = "";
                }
                return new dg81(24, strM38012j0, new nwv0(0, contextTrack), ydj.m93442a(k231.m55147a(contextTrack)));
            default:
                pqm0 pqm0Var = (pqm0) obj;
                List<ContextTrack> list = (List) pqm0Var.f180350a;
                Boolean bool = (Boolean) pqm0Var.f180351b;
                bool.getClass();
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
                for (ContextTrack contextTrack2 : list) {
                    arrayList2.add(new pqm0(contextTrack2.uri(), a5y.m24822b(contextTrack2)));
                }
                return new pqm0(bool, arrayList2);
        }
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: b */
    public iix mo53476b() {
        throw new IllegalStateException();
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: c */
    public byte[] mo53477c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        jo80 jo80VarM53866a = jo80.m53866a(i);
        return jo80VarM53866a == null ? jo80.LIST_UNKNOWN : jo80VarM53866a;
    }

    @Override // p204p.fum0
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        vi30 vi30Var = new vi30(parcel);
        vi30Var.f241608a = (iqk) parcel.readParcelable(classLoader);
        return vi30Var;
    }

    @Override // p204p.kcb
    /* JADX INFO: renamed from: d */
    public CamcorderProfile mo56036d(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: e */
    public void mo53478e(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: f */
    public void mo53479f(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((qy00) obj);
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        Set set = dd41.f47702f;
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        dd41 dd41VarM74726U = r46.m74726U(dataString);
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("overriddenReturnToUri") : null;
        String strM35712j = dd41VarM74726U.m35712j();
        String str = strM35712j != null ? strM35712j : "";
        return tm4.m81101y(a3c0.class, new f3c0(str, xoc1.f263900H5.m83614b("spotify:internal:parental-control:manage-blocked-content:".concat(str)), k1n0.f118397b, string));
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: h */
    public int mo53480h() {
        return 1;
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: i */
    public lyl mo53481i(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: l */
    public byte[] mo53484l(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: m */
    public gix mo53485m(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // p204p.fum0
    public Object[] newArray(int i) {
        return new vi30[i];
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: o */
    public boolean mo53487o(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: q */
    public synchronized cxe m78855q() {
        cxe cxeVar;
        cxe cxeVar2;
        try {
            cxeVar = null;
            if (p2l.f173365a.contains(cxe.class)) {
                cxeVar2 = null;
            } else {
                try {
                    cxeVar2 = cxe.f43009g;
                } catch (Throwable th) {
                    p2l.m68953a(cxe.class, th);
                    cxeVar2 = null;
                }
            }
            if (cxeVar2 == null) {
                cxe cxeVar3 = new cxe(0);
                if (!p2l.f173365a.contains(cxe.class)) {
                    try {
                        cxe.f43009g = cxeVar3;
                    } catch (Throwable th2) {
                        p2l.m68953a(cxe.class, th2);
                    }
                }
            }
            if (!p2l.f173365a.contains(cxe.class)) {
                try {
                    cxeVar = cxe.f43009g;
                } catch (Throwable th3) {
                    p2l.m68953a(cxe.class, th3);
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return cxeVar;
    }

    @Override // p204p.kcb
    /* JADX INFO: renamed from: r */
    public boolean mo56037r(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    public /* synthetic */ sp5(Object obj, int i) {
        this.f212733a = i;
    }

    public /* synthetic */ sp5(son sonVar, otn otnVar, int i) {
        this.f212733a = i;
    }

    public sp5(C1776df c1776df, bjc0 bjc0Var, rxt rxtVar, bjc0 bjc0Var2, bjc0 bjc0Var3, bjc0 bjc0Var4) {
        this.f212733a = 1;
    }

    @Override // p204p.jix
    public void release() {
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: j */
    public void mo53482j(byte[] bArr) {
    }

    @Override // p204p.jix
    /* JADX INFO: renamed from: n */
    public void mo53486n(xvo xvoVar) {
    }
}
