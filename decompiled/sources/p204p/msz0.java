package p204p;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.proto.model.p044v1.proto.SubmitCheckoutResponse;
import com.spotify.download.esperanto.proto.EsDownload$VideoBandwidthResponse;
import com.spotify.externalintegration.http.ExternalIntegrationBackendResponseModel;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextPlayerState;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.Restrictions;
import com.spotify.prefs.esperanto.proto.EsPrefs$Value;
import com.spotify.profile.socialgraphimpl.proto.BlockedlistResponse$RelationsUsernameResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import p196j$.util.Base64;
import spotify.autodownload.esperanto.proto.DisableAllEnabledShowsResponse;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class msz0 implements Predicate, Function3, Function, Init, vja1, BiFunction, lir {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146910a;

    /* JADX INFO: renamed from: b */
    public static final msz0 f146899b = new msz0(0);

    /* JADX INFO: renamed from: c */
    public static final msz0 f146901c = new msz0(1);

    /* JADX INFO: renamed from: d */
    public static final msz0 f146903d = new msz0(2);

    /* JADX INFO: renamed from: e */
    public static final msz0 f146904e = new msz0(3);

    /* JADX INFO: renamed from: f */
    public static final msz0 f146905f = new msz0(4);

    /* JADX INFO: renamed from: g */
    public static final msz0 f146906g = new msz0(5);

    /* JADX INFO: renamed from: h */
    public static final msz0 f146907h = new msz0(6);

    /* JADX INFO: renamed from: i */
    public static final msz0 f146908i = new msz0(7);

    /* JADX INFO: renamed from: t */
    public static final msz0 f146909t = new msz0(8);

    /* JADX INFO: renamed from: X */
    public static final msz0 f146892X = new msz0(9);

    /* JADX INFO: renamed from: Y */
    public static final msz0 f146894Y = new msz0(10);

    /* JADX INFO: renamed from: Z */
    public static final msz0 f146896Z = new msz0(11);

    /* JADX INFO: renamed from: L0 */
    public static final msz0 f146880L0 = new msz0(12);

    /* JADX INFO: renamed from: M0 */
    public static final msz0 f146881M0 = new msz0(13);

    /* JADX INFO: renamed from: N0 */
    public static final /* synthetic */ msz0 f146882N0 = new msz0(14);

    /* JADX INFO: renamed from: O0 */
    public static final msz0 f146883O0 = new msz0(15);

    /* JADX INFO: renamed from: P0 */
    public static final msz0 f146884P0 = new msz0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final msz0 f146885Q0 = new msz0(17);

    /* JADX INFO: renamed from: R0 */
    public static final msz0 f146886R0 = new msz0(18);

    /* JADX INFO: renamed from: S0 */
    public static final msz0 f146887S0 = new msz0(19);

    /* JADX INFO: renamed from: T0 */
    public static final msz0 f146888T0 = new msz0(20);

    /* JADX INFO: renamed from: U0 */
    public static final msz0 f146889U0 = new msz0(21);

    /* JADX INFO: renamed from: V0 */
    public static final msz0 f146890V0 = new msz0(22);

    /* JADX INFO: renamed from: W0 */
    public static final msz0 f146891W0 = new msz0(23);

    /* JADX INFO: renamed from: X0 */
    public static final msz0 f146893X0 = new msz0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final msz0 f146895Y0 = new msz0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final msz0 f146897Z0 = new msz0(26);

    /* JADX INFO: renamed from: a1 */
    public static final msz0 f146898a1 = new msz0(27);

    /* JADX INFO: renamed from: b1 */
    public static final msz0 f146900b1 = new msz0(28);

    /* JADX INFO: renamed from: c1 */
    public static final msz0 f146902c1 = new msz0(29);

    public /* synthetic */ msz0(int i) {
        this.f146910a = i;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #5 {all -> 0x00cf, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:31:0x005e, B:41:0x007c, B:51:0x0099, B:65:0x00c8, B:49:0x0093, B:39:0x0076, B:29:0x0058, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:44:0x0089, B:34:0x006b, B:24:0x004d, B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:85:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #5 {all -> 0x00cf, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:31:0x005e, B:41:0x007c, B:51:0x0099, B:65:0x00c8, B:49:0x0093, B:39:0x0076, B:29:0x0058, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:44:0x0089, B:34:0x006b, B:24:0x004d, B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:85:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #5 {all -> 0x00cf, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:31:0x005e, B:41:0x007c, B:51:0x0099, B:65:0x00c8, B:49:0x0093, B:39:0x0076, B:29:0x0058, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:44:0x0089, B:34:0x006b, B:24:0x004d, B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:85:0x000f, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:83:0x00a5, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5 A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:54:0x00a5, B:57:0x00af, B:59:0x00b5, B:62:0x00bc), top: B:83:0x00a5, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final boolean m62783b(View view) {
        boolean z;
        boolean z2;
        TextView textView;
        boolean z3;
        TextView textView2;
        boolean z4;
        TextView textView3;
        String strM83154j;
        boolean zMatches;
        msz0 msz0Var = f146899b;
        Set set = p2l.f173365a;
        if (set.contains(msz0.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView4 = (TextView) view;
            if (set.contains(msz0Var)) {
                z = false;
            } else {
                try {
                    z = textView4.getInputType() == 128 ? true : textView4.getTransformationMethod() instanceof PasswordTransformationMethod;
                } catch (Throwable th) {
                    p2l.m68953a(msz0Var, th);
                    z = false;
                }
            }
            if (!z && !msz0Var.m62784a((TextView) view)) {
                TextView textView5 = (TextView) view;
                if (p2l.f173365a.contains(msz0Var)) {
                    z2 = false;
                    if (!z2) {
                        textView = (TextView) view;
                        if (p2l.f173365a.contains(msz0Var)) {
                            z3 = false;
                            if (!z3) {
                                textView2 = (TextView) view;
                                if (p2l.f173365a.contains(msz0Var)) {
                                    z4 = false;
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (p2l.f173365a.contains(msz0Var)) {
                                            zMatches = false;
                                        } else {
                                            try {
                                                if (textView3.getInputType() == 32) {
                                                    zMatches = true;
                                                } else {
                                                    strM83154j = uhc1.m83154j(textView3);
                                                    if (strM83154j != null || strM83154j.length() == 0) {
                                                        zMatches = false;
                                                    } else {
                                                        zMatches = Patterns.EMAIL_ADDRESS.matcher(strM83154j).matches();
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                p2l.m68953a(msz0Var, th2);
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    try {
                                        if (textView2.getInputType() == 3) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    } catch (Throwable th3) {
                                        p2l.m68953a(msz0Var, th3);
                                    }
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (p2l.f173365a.contains(msz0Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strM83154j = uhc1.m83154j(textView3);
                                            if (strM83154j != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        } else {
                            try {
                                if (textView.getInputType() == 112) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } catch (Throwable th4) {
                                p2l.m68953a(msz0Var, th4);
                            }
                            if (!z3) {
                                textView2 = (TextView) view;
                                if (p2l.f173365a.contains(msz0Var)) {
                                    z4 = false;
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (p2l.f173365a.contains(msz0Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strM83154j = uhc1.m83154j(textView3);
                                            if (strM83154j != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (p2l.f173365a.contains(msz0Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strM83154j = uhc1.m83154j(textView3);
                                            if (strM83154j != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    try {
                        if (textView5.getInputType() == 96) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } catch (Throwable th5) {
                        p2l.m68953a(msz0Var, th5);
                    }
                    if (!z2) {
                        textView = (TextView) view;
                        if (p2l.f173365a.contains(msz0Var)) {
                            z3 = false;
                            if (!z3) {
                                textView2 = (TextView) view;
                                if (p2l.f173365a.contains(msz0Var)) {
                                    z4 = false;
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (p2l.f173365a.contains(msz0Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strM83154j = uhc1.m83154j(textView3);
                                            if (strM83154j != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (p2l.f173365a.contains(msz0Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strM83154j = uhc1.m83154j(textView3);
                                            if (strM83154j != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (textView.getInputType() == 112) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                textView2 = (TextView) view;
                                if (p2l.f173365a.contains(msz0Var)) {
                                    z4 = false;
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (p2l.f173365a.contains(msz0Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strM83154j = uhc1.m83154j(textView3);
                                            if (strM83154j != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        textView3 = (TextView) view;
                                        if (p2l.f173365a.contains(msz0Var)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strM83154j = uhc1.m83154j(textView3);
                                            if (strM83154j != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        } catch (Throwable th6) {
            p2l.m68953a(msz0.class, th6);
            return false;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        return new yk91((String) obj, (Restrictions) obj2, (am81) obj3);
    }

    /* JADX INFO: renamed from: a */
    public boolean m62784a(TextView textView) {
        if (p2l.f173365a.contains(this)) {
            return false;
        }
        try {
            String strReplaceAll = Pattern.compile("\\s").matcher(uhc1.m83154j(textView)).replaceAll("");
            int length = strReplaceAll.length();
            if (length >= 12 && length <= 19) {
                int i = 0;
                boolean z = false;
                for (int i2 = length - 1; -1 < i2; i2--) {
                    char cCharAt = strReplaceAll.charAt(i2);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iM96514B = zn91.m96514B(cCharAt);
                    if (z && (iM96514B = iM96514B * 2) > 9) {
                        iM96514B = (iM96514B % 10) + 1;
                    }
                    i += iM96514B;
                    z = !z;
                }
                if (i % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return false;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f146910a) {
            case 3:
                return ((PlayerQueue) obj).nextTracks();
            case 4:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (obj2 instanceof tq50) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 5:
                return Boolean.valueOf(((a94) obj).f13463a);
            case 6:
            case 7:
            case 8:
            case 10:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
            case 23:
            case 27:
            default:
                return Boolean.FALSE;
            case 9:
                byte[] bArr = (byte[]) obj;
                try {
                    return DisableAllEnabledShowsResponse.m97407n(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.autodownload.esperanto.proto.DisableAllEnabledShowsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 11:
                BlockedlistResponse$RelationsUsernameResponse blockedlistResponse$RelationsUsernameResponse = (BlockedlistResponse$RelationsUsernameResponse) ((o2x0) obj).f161172b;
                return blockedlistResponse$RelationsUsernameResponse == null ? BlockedlistResponse$RelationsUsernameResponse.m19833n() : blockedlistResponse$RelationsUsernameResponse;
            case 12:
                o2x0 o2x0Var = (o2x0) obj;
                n2x0 n2x0Var = o2x0Var.f161171a;
                int i = n2x0Var.m63571a().f22998c;
                pyx pyxVar = n2x0Var.f149865i != null ? pyx.f183536c : (n2x0Var.f149866t == null || (System.currentTimeMillis() - n2x0Var.f149856Z) / ((long) 1000) > ((long) i)) ? pyx.f183534a : pyx.f183535b;
                ExternalIntegrationBackendResponseModel externalIntegrationBackendResponseModel = (ExternalIntegrationBackendResponseModel) o2x0Var.f161172b;
                return externalIntegrationBackendResponseModel != null ? new oyx(externalIntegrationBackendResponseModel.sectionContent, pyxVar, null) : new oyx(lau.f131415a, pyxVar, null);
            case 15:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return CollectionDecorateResponse.m97478u(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.collection.esperanto.proto.CollectionDecorateResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 18:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return EsContextPlayerState$ContextPlayerState.m17700Z(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.player.esperanto.proto.EsContextPlayerState.ContextPlayerState: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 20:
                Logger.m3967c((Throwable) obj, "AccessoryOnboarding: Error during BT permissions flow", new Object[0]);
                return qto.f192420a;
            case 21:
                return Observable.just(Boolean.FALSE);
            case 22:
                return Boolean.valueOf(((ezk) obj).f64406a);
            case 24:
                return new e1r((String) obj, null);
            case 25:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return EsDownload$VideoBandwidthResponse.m9569o(bArr4);
                } catch (Exception e4) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.download.esperanto.proto.EsDownload.VideoBandwidthResponse: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e4);
                }
            case 26:
                return new zsw((SubmitCheckoutResponse) obj);
            case 28:
                return Long.valueOf(((EsPrefs$Value) obj).m19528s());
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f146910a) {
            case 6:
                lp5 lp5Var = (lp5) obj;
                return lp5Var.f135625e ? First.m15575c(lp5.m59589a(lp5Var, null, false, false, null, null, 239), Collections.singleton(new il5(yjg1.m93919k(lp5Var.f135623c), null))) : First.m15574b(lp5Var);
            default:
                return First.m15574b((s3j) obj);
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3 = (String) linkedHashMap.get("book_id");
        if (str3 == null || str3.length() != 22) {
            return null;
        }
        int length = str3.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str3.charAt(i);
            if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                return null;
            }
        }
        return new ke7(str3, mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f146910a) {
            case 1:
                return ((mv41) obj) instanceof ju41;
            case 13:
                return ((dyb) obj) != dyb.UNKNOWN;
            case 16:
                return !((iqx) ((gqx) obj)).f104863f;
            case 23:
                api apiVar = (api) obj;
                return (apiVar.mo26697m() || apiVar.mo26682D()) ? false : true;
            default:
                gqx gqxVar = (gqx) obj;
                return gqxVar.mo45451c() || !((iqx) gqxVar).f104863f;
        }
    }

    @Override // p204p.lir
    public boolean test(Object obj, Object obj2) {
        return !((jel) obj).getClass().equals(((jel) obj2).getClass());
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new pqm0((ocy0) obj, (Set) obj2);
    }
}
