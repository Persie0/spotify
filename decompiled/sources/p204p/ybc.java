package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum ybc {
    TRANSFER_FROM_CORE_REQUESTED("transfer_from_core_requested"),
    MEDIA_ROUTE_SELECT_CALLED("media_route_select_called"),
    CAST_SESSION_STARTING("cast_session_starting"),
    CAST_SESSION_STARTED("cast_session_started"),
    AUTH_PROCESS_STARTED("auth_process_started"),
    MESSAGE_CALLBACK_CREATED("message_callback_created"),
    CAST_DYNAMIC_GROUP_ROUTE_ON_SELECT("cast_dynamic_group_route_on_select"),
    MEDIA_ROUTE_CONNECT_CALLED("media_route_connect_called"),
    MEDIA_ROUTER_ROUTE_TO_CONNECT_NOT_FOUND("media_router_route_to_connect_not_found"),
    CAST_ROUTE_ALREADY_CONNECTED("cast_route_already_connected"),
    CAST_ROUTE_ALREADY_CONNECTED_AS_GROUP("cast_route_already_connected_as_group"),
    CAST_DYNAMIC_GROUP_CONTROLLER_REFUSED_UNSUPPORTED_OS("cast_dynamic_group_controller_refused_unsupported_os"),
    CAST_DYNAMIC_GROUP_CONTROLLER_REFUSED_NOT_ENABLED("cast_dynamic_group_controller_refused_not_enabled"),
    CAST_DYNAMIC_GROUP_CONTROLLER_REFUSED_NO_ROUTES("cast_dynamic_group_controller_refused_no_routes"),
    CAST_DYNAMIC_GROUP_CONTROLLER_REFUSED_ROUTE_NOT_FOUND("cast_dynamic_group_controller_refused_route_not_found"),
    CAST_DYNAMIC_GROUP_CONTROLLER_CREATED("cast_dynamic_group_controller_created"),
    CAST_DYNAMIC_INDIVIDUAL_CONTROLLER_CREATED("cast_dynamic_individual_controller_created"),
    CAST_DYNAMIC_INDIVIDUAL_ROUTE_ON_SELECT("cast_dynamic_individual_route_on_select"),
    OUTPUT_SWITCHER_TRANSFER_SKIPPED("output_switcher_transfer_skipped"),
    CAST_ROUTE_NOT_FOUND("cast_route_not_found"),
    TRANSFER_SUCCEEDED("transfer_succeeded"),
    TRANSFER_FAILED("transfer_failed"),
    CAST_SESSION_START_FAILED("cast_session_start_failed");


    /* JADX INFO: renamed from: a */
    public final String f271153a;

    ybc(String str) {
        this.f271153a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m93258a() {
        return this.f271153a;
    }
}
