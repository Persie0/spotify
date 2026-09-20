package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class xbx0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qqn f260025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f260026b;

    public xbx0(qqn qqnVar, String str) {
        this.f260025a = qqnVar;
        this.f260026b = str;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0191  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        wbx0 wbx0Var;
        Object gbx0Var;
        eq31 eq31Var;
        int i;
        eq31 eq31Var2;
        String str;
        String str2;
        Object next;
        int i2;
        int i3;
        if (ibkVar instanceof wbx0) {
            wbx0Var = (wbx0) ibkVar;
            int i4 = wbx0Var.f249877b;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                wbx0Var.f249877b = i4 - Integer.MIN_VALUE;
            } else {
                wbx0Var = new wbx0(this, ibkVar);
            }
        } else {
            wbx0Var = new wbx0(this, ibkVar);
        }
        Object obj2 = wbx0Var.f249876a;
        int i5 = wbx0Var.f249877b;
        if (i5 == 0) {
            bga.m29073P(obj2);
            abx0 abx0Var = (abx0) obj;
            if (abx0Var.f14201a.length() > 0) {
                jq31 jq31VarM73574a = this.f260025a.m73574a(abx0Var.f14201a);
                Set setMo48707b = jq31VarM73574a.f114781a.mo48707b(jq31.f114780f, gbu.f78413a);
                int i6 = 2;
                int i7 = 0;
                eq31 eq31Var3 = null;
                String str3 = this.f260026b;
                if (setMo48707b != null) {
                    Iterator it = setMo48707b.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!wl51.m88496t0((String) next, str3, false));
                    String str4 = (String) next;
                    if (str4 != null) {
                        List listM88477a1 = wl51.m88477a1(str4, new String[]{"|"}, 0, 6);
                        String str5 = (String) listM88477a1.get(1);
                        if (str5 == null) {
                            throw new NullPointerException("Name is null");
                        }
                        if (str5.equals("Default")) {
                            i2 = 1;
                        } else if (str5.equals("Newest")) {
                            i2 = 2;
                        } else if (str5.equals("Oldest")) {
                            i2 = 3;
                        } else {
                            if (!str5.equals("MostPopular")) {
                                throw new IllegalArgumentException("No enum constant com.spotify.creativeworkplatform.creativeworkplatformapi.Sort.".concat(str5));
                            }
                            i2 = 4;
                        }
                        String str6 = (String) listM88477a1.get(2);
                        if (str6 == null) {
                            throw new NullPointerException("Name is null");
                        }
                        if (str6.equals("None")) {
                            i3 = 1;
                        } else if (str6.equals("AvailableOffline")) {
                            i3 = 2;
                        } else {
                            if (!str6.equals("UnPlayed")) {
                                throw new IllegalArgumentException("No enum constant com.spotify.creativeworkplatform.creativeworkplatformapi.Filter.".concat(str6));
                            }
                            i3 = 3;
                        }
                        eq31Var = new eq31(i2, i3);
                    } else {
                        eq31Var = null;
                    }
                } else {
                    eq31Var = null;
                }
                if (eq31Var == null) {
                    Map map = (Map) jq31VarM73574a.f114782b.getValue();
                    if (map != null && (str2 = (String) map.get(str3)) != null) {
                        switch (str2) {
                            case "BY_CONSUMPTION_ORDER":
                                i = 1;
                                break;
                            case "BY_DATE_ASC":
                                i = 3;
                                break;
                            case "BY_DATE_DESC":
                                i = 2;
                                break;
                            case "BY_POPULARITY":
                                i = 4;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                    } else {
                        i = 0;
                    }
                    Map map2 = (Map) jq31VarM73574a.f114783c.getValue();
                    if (map2 != null && (str = (String) map2.get(str3)) != null) {
                        int iHashCode = str.hashCode();
                        if (iHashCode != 3387192) {
                            if (iHashCode != 414231974) {
                                if (iHashCode == 1902890136 && str.equals("unPlayedOnly")) {
                                    i6 = 3;
                                } else {
                                    i6 = 0;
                                }
                            } else if (!str.equals("availableOfflineOnly")) {
                                i6 = 0;
                            }
                        } else if (str.equals("none")) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        i7 = i6;
                    }
                    if (i != 0 && i7 != 0) {
                        eq31Var2 = new eq31(i, i7);
                    } else if (i != 0) {
                        eq31Var2 = new eq31(i, 1);
                    } else {
                        eq31Var2 = i7 != 0 ? new eq31(1, i7) : null;
                    }
                    if (eq31Var2 != null) {
                        jq31VarM73574a.m54031b(str3, eq31Var2);
                        eq31Var3 = eq31Var2;
                    }
                    eq31Var = eq31Var3 == null ? new eq31(1, 1) : eq31Var3;
                }
                gbx0Var = new gbx0(eq31Var);
            } else {
                gbx0Var = new gbx0(new eq31(1, 1));
            }
            wbx0Var.f249877b = 1;
            Object objMo30229d = bqz0Var.mo30229d(gbx0Var, wbx0Var);
            Object obj3 = yuk.f276404a;
            if (objMo30229d == obj3) {
                return obj3;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
