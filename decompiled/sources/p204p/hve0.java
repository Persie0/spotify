package p204p;

import com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException;
import com.spotify.interapp.model.AppProtocol$HelloDetailsAppProtocol$HelloDetails;
import com.spotify.interapp.model.AppProtocol$HelloDetailsAppProtocol$Info;
import com.spotify.interapp.model.AppProtocol$HelloDetailsAppProtocol$Roles;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class hve0 extends t46 {
    /* JADX INFO: renamed from: A */
    public static void m48823A(String str, Object obj, String str2) throws FieldValidator$ValidationException {
        if (obj.toString().contains(str)) {
            return;
        }
        na6.m63957e(" Error validating ".concat(str2));
        throw new FieldValidator$ValidationException(dq60.m36615o("\"", str2, "\" has no value for key \"", str, "\""));
    }

    /* JADX INFO: renamed from: B */
    public static void m48824B(String str, AppProtocol$HelloDetailsAppProtocol$HelloDetails appProtocol$HelloDetailsAppProtocol$HelloDetails) {
        t46.m80050v("uri", "spotify", str);
        m48823A("info", appProtocol$HelloDetailsAppProtocol$HelloDetails, "details");
        AppProtocol$HelloDetailsAppProtocol$Info appProtocol$HelloDetailsAppProtocol$Info = appProtocol$HelloDetailsAppProtocol$HelloDetails.info;
        t46.m80050v("protocol version", 1, appProtocol$HelloDetailsAppProtocol$Info.protocolVersion);
        t46.m80052x(appProtocol$HelloDetailsAppProtocol$Info.name, "name");
        t46.m80052x(appProtocol$HelloDetailsAppProtocol$Info.id, "id");
        t46.m80054z(0, 10000, appProtocol$HelloDetailsAppProtocol$Info.defaultImageWidth.intValue(), "default image width");
        t46.m80054z(0, 10000, appProtocol$HelloDetailsAppProtocol$Info.defaultImageHeight.intValue(), "default image height");
        t46.m80054z(0, 10000, appProtocol$HelloDetailsAppProtocol$Info.defaultThumbnailImageWidth.intValue(), "default thumbnail image width");
        t46.m80054z(0, 10000, appProtocol$HelloDetailsAppProtocol$Info.defaultThumbnailImageHeight.intValue(), "default thumbnail image height");
        AppProtocol$HelloDetailsAppProtocol$Roles appProtocol$HelloDetailsAppProtocol$Roles = appProtocol$HelloDetailsAppProtocol$HelloDetails.roles;
        m48823A("subscriber", appProtocol$HelloDetailsAppProtocol$Roles, "roles");
        m48823A("caller", appProtocol$HelloDetailsAppProtocol$Roles, "roles");
    }

    /* JADX INFO: renamed from: C */
    public static void m48825C(AppProtocol$HelloDetailsAppProtocol$HelloDetails appProtocol$HelloDetailsAppProtocol$HelloDetails) {
        t46.m80052x(appProtocol$HelloDetailsAppProtocol$HelloDetails.authid, "authid");
        List<String> list = appProtocol$HelloDetailsAppProtocol$HelloDetails.authmethods;
        if (list == null || list.size() == 0) {
            throw new FieldValidator$ValidationException("\"authmethods\" can not be empty");
        }
        for (String str : list) {
            if (!uh7.f230378a.contains(str)) {
                throw new FieldValidator$ValidationException(s571.m77251j("\"", str, "\" is not a valid auth method"));
            }
        }
    }
}
