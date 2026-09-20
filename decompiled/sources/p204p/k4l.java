package p204p;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k4l {

    /* JADX INFO: renamed from: a */
    public static final ae00 f119245a;

    static {
        uk60 uk60Var = new uk60();
        b5v.f23716X.m28209b(uk60Var);
        uk60Var.f231244d = true;
        f119245a = new ae00(uk60Var, 14);
    }

    /* JADX INFO: renamed from: a */
    public static zz7 m55383a(JsonReader jsonReader) throws IOException {
        yz7 yz7Var = new yz7();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    yz7Var.m94968d(jsonReader.nextLong());
                    break;
                case "symbol":
                    yz7Var.m94970f(jsonReader.nextString());
                    break;
                case "pc":
                    yz7Var.m94969e(jsonReader.nextLong());
                    break;
                case "file":
                    yz7Var.m94966b(jsonReader.nextString());
                    break;
                case "importance":
                    yz7Var.m94967c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return yz7Var.m94965a();
    }

    /* JADX INFO: renamed from: b */
    public static bz7 m55384b(JsonReader jsonReader) throws IOException {
        az7 az7Var = new az7();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                az7Var.m27578b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                az7Var.m27579c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return az7Var.m27577a();
    }

    /* JADX INFO: renamed from: c */
    public static xy7 m55385c(JsonReader jsonReader) throws IOException {
        wy7 wy7Var = new wy7();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    wy7Var.m89340b(m55386d(jsonReader, new lp7(29)));
                    break;
                case "pid":
                    wy7Var.m89342d(jsonReader.nextInt());
                    break;
                case "pss":
                    wy7Var.m89344f(jsonReader.nextLong());
                    break;
                case "rss":
                    wy7Var.m89346h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    wy7Var.m89347i(jsonReader.nextLong());
                    break;
                case "processName":
                    wy7Var.m89343e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    wy7Var.m89345g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    wy7Var.m89348j(jsonReader.nextString());
                    break;
                case "importance":
                    wy7Var.m89341c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return wy7Var.m89339a();
    }

    /* JADX INFO: renamed from: d */
    public static List m55386d(JsonReader jsonReader, j4l j4lVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(j4lVar.mo49677b(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static mz7 m55387e(JsonReader jsonReader) throws IOException {
        lz7 lz7Var = new lz7();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i = 3;
            int i2 = 2;
            int i3 = 1;
            switch (strNextName) {
                case "device":
                    c08 c08Var = new c08();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                c08Var.m31117b(Double.valueOf(jsonReader.nextDouble()));
                                break;
                            case "batteryVelocity":
                                c08Var.m31118c(jsonReader.nextInt());
                                break;
                            case "orientation":
                                c08Var.m31120e(jsonReader.nextInt());
                                break;
                            case "diskUsed":
                                c08Var.m31119d(jsonReader.nextLong());
                                break;
                            case "ramUsed":
                                c08Var.m31122g(jsonReader.nextLong());
                                break;
                            case "proximityOn":
                                c08Var.m31121f(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    lz7Var.m60288c(c08Var.m31116a());
                    break;
                case "rollouts":
                    i08 i08Var = new i08();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            i08Var.m49308b(m55386d(jsonReader, new i4l(i3)));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    lz7Var.m60290e(i08Var.m49307a());
                    break;
                case "app":
                    nz7 nz7Var = new nz7();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(m55389g(jsonReader));
                                }
                                jsonReader.endArray();
                                nz7Var.m65947b(Collections.unmodifiableList(arrayList));
                                break;
                            case "background":
                                nz7Var.m65948c(Boolean.valueOf(jsonReader.nextBoolean()));
                                break;
                            case "execution":
                                azp0 azp0Var = new azp0(11);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            azp0Var.m27639B(m55385c(jsonReader));
                                            break;
                                        case "threads":
                                            azp0Var.m27643F(m55386d(jsonReader, new i4l(i2)));
                                            break;
                                        case "signal":
                                            uz7 uz7Var = new uz7();
                                            jsonReader.beginObject();
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        uz7Var.m84285b(jsonReader.nextLong());
                                                        break;
                                                    case "code":
                                                        uz7Var.m84286c(jsonReader.nextString());
                                                        break;
                                                    case "name":
                                                        uz7Var.m84287d(jsonReader.nextString());
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            azp0Var.m27642E(uz7Var.m84284a());
                                            break;
                                        case "binaries":
                                            azp0Var.m27640C(m55386d(jsonReader, new i4l(i)));
                                            break;
                                        case "exception":
                                            azp0Var.m27641D(m55388f(jsonReader));
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                nz7Var.m65951f(azp0Var.m27659r());
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(m55384b(jsonReader));
                                }
                                jsonReader.endArray();
                                nz7Var.m65952g(Collections.unmodifiableList(arrayList2));
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(m55384b(jsonReader));
                                }
                                jsonReader.endArray();
                                nz7Var.m65950e(Collections.unmodifiableList(arrayList3));
                                break;
                            case "uiOrientation":
                                nz7Var.m65953h(jsonReader.nextInt());
                                break;
                            case "currentProcessDetails":
                                nz7Var.m65949d(m55389g(jsonReader));
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    lz7Var.m60287b(nz7Var.m65946a());
                    break;
                case "log":
                    nch1 nch1Var = new nch1();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            nch1Var.m64162b(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    lz7Var.m60289d(nch1Var.m64161a());
                    break;
                case "type":
                    lz7Var.m60292g(jsonReader.nextString());
                    break;
                case "timestamp":
                    lz7Var.m60291f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return lz7Var.m60286a();
    }

    /* JADX INFO: renamed from: f */
    public static tz7 m55388f(JsonReader jsonReader) throws IOException {
        sz7 sz7Var = new sz7();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    sz7Var.m79726c(m55386d(jsonReader, new i4l(5)));
                    break;
                case "reason":
                    sz7Var.m79728e(jsonReader.nextString());
                    break;
                case "type":
                    sz7Var.m79729f(jsonReader.nextString());
                    break;
                case "causedBy":
                    sz7Var.m79725b(m55388f(jsonReader));
                    break;
                case "overflowCount":
                    sz7Var.m79727d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return sz7Var.m79724a();
    }

    /* JADX INFO: renamed from: g */
    public static b08 m55389g(JsonReader jsonReader) throws IOException {
        a08 a08Var = new a08();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    a08Var.f11009b = jsonReader.nextInt();
                    a08Var.f11012e = (byte) (a08Var.f11012e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    a08Var.f11008a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    a08Var.f11011d = jsonReader.nextBoolean();
                    a08Var.f11012e = (byte) (a08Var.f11012e | 4);
                    break;
                case "importance":
                    a08Var.f11010c = jsonReader.nextInt();
                    a08Var.f11012e = (byte) (a08Var.f11012e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a08Var.m24328a();
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0197 A[PHI: r19
      0x0197: PHI (r19v12 char) = 
      (r19v1 char)
      (r19v2 char)
      (r19v3 char)
      (r19v4 char)
      (r19v5 char)
      (r19v6 char)
      (r19v7 char)
      (r19v8 char)
      (r19v9 char)
      (r19v10 char)
      (r19v11 char)
      (r19v13 char)
     binds: [B:111:0x0195, B:107:0x0187, B:103:0x017c, B:99:0x0171, B:95:0x0163, B:91:0x0156, B:87:0x0149, B:83:0x013a, B:79:0x012a, B:75:0x011a, B:71:0x010a, B:67:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: h */
    public static uy7 m55390h(JsonReader jsonReader) throws IOException {
        char c;
        int i;
        byte b;
        Charset charset = g4l.f76438a;
        ty7 ty7Var = new ty7();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i2 = 6;
            int i3 = 0;
            switch (strNextName) {
                case "ndkPayload":
                    cz7 cz7Var = new cz7();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            cz7Var.m34413b(m55386d(jsonReader, new i4l(i3)));
                        } else if (strNextName2.equals("orgId")) {
                            cz7Var.m34414c(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    ty7Var.f224866k = cz7Var.m34412a();
                    continue;
                    break;
                case "sdkVersion":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    ty7Var.f224856a = strNextString;
                    break;
                    break;
                case "appQualitySessionId":
                    ty7Var.f224862g = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    ty7Var.f224867l = m55385c(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    ty7Var.f224863h = strNextString2;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    ty7Var.f224861f = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    ty7Var.f224857b = strNextString3;
                    break;
                    break;
                case "installationUuid":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    ty7Var.f224859d = strNextString4;
                    break;
                    break;
                case "firebaseInstallationId":
                    ty7Var.f224860e = jsonReader.nextString();
                    break;
                case "platform":
                    ty7Var.f224858c = jsonReader.nextInt();
                    ty7Var.f224868m = (byte) (ty7Var.f224868m | 1);
                    break;
                case "displayVersion":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    ty7Var.f224864i = strNextString5;
                    break;
                    break;
                case "session":
                    fz7 fz7Var = new fz7();
                    fz7Var.f74929f = false;
                    fz7Var.f74936m = (byte) (fz7Var.f74936m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3.hashCode()) {
                            case -2128794476:
                                c = '\b';
                                if (!strNextName3.equals("startedAt")) {
                                    i = -1;
                                } else {
                                    i = 0;
                                }
                                break;
                            case -1907185581:
                                c = '\b';
                                if (!strNextName3.equals("appQualitySessionId")) {
                                    i = -1;
                                } else {
                                    i = 1;
                                }
                                break;
                            case -1618432855:
                                c = '\b';
                                if (!strNextName3.equals("identifier")) {
                                    i = -1;
                                } else {
                                    i = 2;
                                }
                                break;
                            case -1606742899:
                                c = '\b';
                                if (!strNextName3.equals("endedAt")) {
                                    i = -1;
                                } else {
                                    i = 3;
                                }
                                break;
                            case -1335157162:
                                c = '\b';
                                if (!strNextName3.equals("device")) {
                                    i = -1;
                                } else {
                                    i = 4;
                                }
                                break;
                            case -1291329255:
                                c = '\b';
                                if (!strNextName3.equals("events")) {
                                    i = -1;
                                } else {
                                    i = 5;
                                }
                                break;
                            case 3556:
                                c = '\b';
                                if (!strNextName3.equals("os")) {
                                    i = -1;
                                } else {
                                    i = i2;
                                }
                                break;
                            case 96801:
                                c = '\b';
                                if (!strNextName3.equals("app")) {
                                    i = -1;
                                } else {
                                    i = 7;
                                }
                                break;
                            case 3599307:
                                c = '\b';
                                if (!strNextName3.equals("user")) {
                                    i = -1;
                                } else {
                                    i = 8;
                                }
                                break;
                            case 286956243:
                                c = '\b';
                                if (!strNextName3.equals("generator")) {
                                    i = -1;
                                } else {
                                    i = 9;
                                }
                                break;
                            case 1025385094:
                                c = '\b';
                                if (!strNextName3.equals("crashed")) {
                                    i = -1;
                                } else {
                                    i = 10;
                                }
                                break;
                            case 2047016109:
                                c = '\b';
                                if (!strNextName3.equals("generatorType")) {
                                    i = -1;
                                } else {
                                    i = 11;
                                }
                                break;
                            default:
                                i = -1;
                                c = '\b';
                                break;
                        }
                        switch (i) {
                            case 0:
                                fz7Var.f74927d = jsonReader.nextLong();
                                fz7Var.f74936m = (byte) (fz7Var.f74936m | 1);
                                break;
                            case 1:
                                fz7Var.f74926c = jsonReader.nextString();
                                break;
                            case 2:
                                fz7Var.f74925b = new String(Base64.decode(jsonReader.nextString(), 2), g4l.f76438a);
                                break;
                            case 3:
                                fz7Var.f74928e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                jz7 jz7Var = new jz7();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4.hashCode()) {
                                        case -1981332476:
                                            b = !strNextName4.equals("simulator") ? (byte) -1 : (byte) 0;
                                            break;
                                        case -1969347631:
                                            b = !strNextName4.equals("manufacturer") ? (byte) -1 : (byte) 1;
                                            break;
                                        case 112670:
                                            b = !strNextName4.equals("ram") ? (byte) -1 : (byte) 2;
                                            break;
                                        case 3002454:
                                            b = !strNextName4.equals("arch") ? (byte) -1 : (byte) 3;
                                            break;
                                        case 81784169:
                                            b = !strNextName4.equals("diskSpace") ? (byte) -1 : (byte) 4;
                                            break;
                                        case 94848180:
                                            b = !strNextName4.equals("cores") ? (byte) -1 : (byte) 5;
                                            break;
                                        case 104069929:
                                            b = !strNextName4.equals("model") ? (byte) -1 : (byte) 6;
                                            break;
                                        case 109757585:
                                            b = !strNextName4.equals("state") ? (byte) -1 : (byte) 7;
                                            break;
                                        case 2078953423:
                                            b = !strNextName4.equals("modelClass") ? (byte) -1 : c;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        case 0:
                                            jz7Var.f117610f = jsonReader.nextBoolean();
                                            jz7Var.f117614j = (byte) (jz7Var.f117614j | 16);
                                            break;
                                        case 1:
                                            String strNextString6 = jsonReader.nextString();
                                            if (strNextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            jz7Var.f117612h = strNextString6;
                                            break;
                                            break;
                                        case 2:
                                            jz7Var.f117608d = jsonReader.nextLong();
                                            jz7Var.f117614j = (byte) (jz7Var.f117614j | 4);
                                            break;
                                        case 3:
                                            jz7Var.f117605a = jsonReader.nextInt();
                                            jz7Var.f117614j = (byte) (jz7Var.f117614j | 1);
                                            break;
                                        case 4:
                                            jz7Var.f117609e = jsonReader.nextLong();
                                            jz7Var.f117614j = (byte) (jz7Var.f117614j | 8);
                                            break;
                                        case 5:
                                            jz7Var.f117607c = jsonReader.nextInt();
                                            jz7Var.f117614j = (byte) (jz7Var.f117614j | 2);
                                            break;
                                        case 6:
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            jz7Var.f117606b = strNextString7;
                                            break;
                                            break;
                                        case 7:
                                            jz7Var.f117611g = jsonReader.nextInt();
                                            jz7Var.f117614j = (byte) (jz7Var.f117614j | 32);
                                            break;
                                        case 8:
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            jz7Var.f117613i = strNextString8;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                fz7Var.f74933j = jz7Var.m54848a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(m55387e(jsonReader));
                                }
                                jsonReader.endArray();
                                fz7Var.f74934k = Collections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                k08 k08Var = new k08();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            k08Var.f117927c = strNextString9;
                                            break;
                                            break;
                                        case "jailbroken":
                                            k08Var.f117928d = jsonReader.nextBoolean();
                                            k08Var.f117929e = (byte) (k08Var.f117929e | 2);
                                            break;
                                        case "version":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            k08Var.f117926b = strNextString10;
                                            break;
                                            break;
                                        case "platform":
                                            k08Var.f117925a = jsonReader.nextInt();
                                            k08Var.f117929e = (byte) (k08Var.f117929e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                fz7Var.f74932i = k08Var.m54932a();
                                break;
                            case 7:
                                kcj0 kcj0Var = new kcj0(i2);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            kcj0Var.m56087b0(jsonReader.nextString());
                                            break;
                                        case "developmentPlatform":
                                            kcj0Var.m56084Y(jsonReader.nextString());
                                            break;
                                        case "developmentPlatformVersion":
                                            kcj0Var.m56085Z(jsonReader.nextString());
                                            break;
                                        case "version":
                                            kcj0Var.m56089d0(jsonReader.nextString());
                                            break;
                                        case "installationUuid":
                                            kcj0Var.m56088c0(jsonReader.nextString());
                                            break;
                                        case "displayVersion":
                                            kcj0Var.m56086a0(jsonReader.nextString());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                fz7Var.f74930g = kcj0Var.m56096t();
                                break;
                            case 8:
                                m08 m08Var = new m08();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        m08Var.m60422c(jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                fz7Var.f74931h = m08Var.m60420a();
                                break;
                            case 9:
                                String strNextString11 = jsonReader.nextString();
                                if (strNextString11 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                fz7Var.f74924a = strNextString11;
                                break;
                                break;
                            case 10:
                                fz7Var.f74929f = jsonReader.nextBoolean();
                                fz7Var.f74936m = (byte) (fz7Var.f74936m | 2);
                                break;
                            case 11:
                                fz7Var.f74935l = jsonReader.nextInt();
                                fz7Var.f74936m = (byte) (fz7Var.f74936m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                        i2 = 6;
                    }
                    jsonReader.endObject();
                    ty7Var.f224865j = fz7Var.m43171a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return ty7Var.m81948a();
    }

    /* JADX INFO: renamed from: i */
    public static uy7 m55391i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                uy7 uy7VarM55390h = m55390h(jsonReader);
                jsonReader.close();
                return uy7VarM55390h;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
