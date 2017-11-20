package com.mscheduler.view.invitation;

public class InvitationDetailVewer extends AbstractInvitationViewer {
    //singleton + constructor
        private static InvitationDetailVewer instance;

        static{
            instance = new InvitationDetailVewer();
        }

        public static InvitationDetailVewer getInstance(){
          return instance;
        }
        
        private InvitationDetailVewer() {
            super();
        }
    //end of singleton
        
    @Override
    public String getText(int meeting_id) {
        //Kamus
        String detail;
        long start=System.currentTimeMillis();
        //Algoritma
        if (ic.isMeetingIdValid(meeting_id,false)) {
            detail = this.ic.detailInvitation(meeting_id);
            return detail + "\n";
        }else{
            long end=System.currentTimeMillis();
            System.out.println("Waktu untuk melihat meeting: "+(end-start)+"(ms)");
            return "Invalid meeting id\n";
            
        }
        
        
    }

    @Override
    public String getHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
