
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class FindReplaceNames extends JFrame {
    
    private static JTextArea input = new JTextArea();
    private static JTextArea output = new JTextArea();
    private static JTextField nameField = new JTextField("Your Name");
    
    private static String[] annonArray = {"aaa","aab","aac","aad","aae","aaf","aag","aah","aai","aaj","aak","aal","aam","aan","aba","abb","abc","abd","abe","abf","abg","abh","abi","abj","abk","abl","abm","abn","aca","acb","acc","acd","ace","acf","acg","ach","aci","acj","ack","acl","acm","acn","ada","adb","adc","add","ade","adf","adg","adh","adi","adj","adk","adl","adm","adn","aea","aeb","aec","aed","aee","aef","aeg","aeh","aei","aej","aek","ael","aem","aen","afa","afb","afc","afd","afe","aff","afg","afh","afi","afj","afk","afl","afm","afn","aga","agb","agc","agd","age","agf","agg","agh","agi","agj","agk","agl","agm","agn","aha","ahb","ahc","ahd","ahe","ahf","ahg","ahh","ahi","ahj","ahk","ahl","ahm","ahn","aia","aib","aic","aid","aie","aif","aig","aih","aii","aij","aik","ail","aim","ain","aja","ajb","ajc","ajd","aje","ajf","ajg","ajh","aji","ajj","ajk","ajl","ajm","ajn","aka","akb","akc","akd","ake","akf","akg","akh","aki","akj","akk","akl","akm","akn","ala","alb","alc","ald","ale","alf","alg","alh","ali","alj","alk","all","alm","aln","ama","amb","amc","amd","ame","amf","amg","amh","ami","amj","amk","aml","amm","amn","ana","anb","anc","and","ane","anf","ang","anh","ani","anj","ank","anl","anm","ann","baa","bab","bac","bad","bae","baf","bag","bah","bai","baj","bak","bal","bam","ban","bba","bbb","bbc","bbd","bbe","bbf","bbg","bbh","bbi","bbj","bbk","bbl","bbm","bbn","bca","bcb","bcc","bcd","bce","bcf","bcg","bch","bci","bcj","bck","bcl","bcm","bcn","bda","bdb","bdc","bdd","bde","bdf","bdg","bdh","bdi","bdj","bdk","bdl","bdm","bdn","bea","beb","bec","bed","bee","bef","beg","beh","bei","bej","bek","bel","bem","ben","bfa","bfb","bfc","bfd","bfe","bff","bfg","bfh","bfi","bfj","bfk","bfl","bfm","bfn","bga","bgb","bgc","bgd","bge","bgf","bgg","bgh","bgi","bgj","bgk","bgl","bgm","bgn","bha","bhb","bhc","bhd","bhe","bhf","bhg","bhh","bhi","bhj","bhk","bhl","bhm","bhn","bia","bib","bic","bid","bie","bif","big","bih","bii","bij","bik","bil","bim","bin","bja","bjb","bjc","bjd","bje","bjf","bjg","bjh","bji","bjj","bjk","bjl","bjm","bjn","bka","bkb","bkc","bkd","bke","bkf","bkg","bkh","bki","bkj","bkk","bkl","bkm","bkn","bla","blb","blc","bld","ble","blf","blg","blh","bli","blj","blk","bll","blm","bln","bma","bmb","bmc","bmd","bme","bmf","bmg","bmh","bmi","bmj","bmk","bml","bmm","bmn","bna","bnb","bnc","bnd","bne","bnf","bng","bnh","bni","bnj","bnk","bnl","bnm","bnn","caa","cab","cac","cad","cae","caf","cag","cah","cai","caj","cak","cal","cam","can","cba","cbb","cbc","cbd","cbe","cbf","cbg","cbh","cbi","cbj","cbk","cbl","cbm","cbn","cca","ccb","ccc","ccd","cce","ccf","ccg","cch","cci","ccj","cck","ccl","ccm","ccn","cda","cdb","cdc","cdd","cde","cdf","cdg","cdh","cdi","cdj","cdk","cdl","cdm","cdn","cea","ceb","cec","ced","cee","cef","ceg","ceh","cei","cej","cek","cel","cem","cen","cfa","cfb","cfc","cfd","cfe","cff","cfg","cfh","cfi","cfj","cfk","cfl","cfm","cfn","cga","cgb","cgc","cgd","cge","cgf","cgg","cgh","cgi","cgj","cgk","cgl","cgm","cgn","cha","chb","chc","chd","che","chf","chg","chh","chi","chj","chk","chl","chm","chn","cia","cib","cic","cid","cie","cif","cig","cih","cii","cij","cik","cil","cim","cin","cja","cjb","cjc","cjd","cje","cjf","cjg","cjh","cji","cjj","cjk","cjl","cjm","cjn","cka","ckb","ckc","ckd","cke","ckf","ckg","ckh","cki","ckj","ckk","ckl","ckm","ckn","cla","clb","clc","cld","cle","clf","clg","clh","cli","clj","clk","cll","clm","cln","cma","cmb","cmc","cmd","cme","cmf","cmg","cmh","cmi","cmj","cmk","cml","cmm","cmn","cna","cnb","cnc","cnd","cne","cnf","cng","cnh","cni","cnj","cnk","cnl","cnm","cnn","daa","dab","dac","dad","dae","daf","dag","dah","dai","daj","dak","dal","dam","dan","dba","dbb","dbc","dbd","dbe","dbf","dbg","dbh","dbi","dbj","dbk","dbl","dbm","dbn","dca","dcb","dcc","dcd","dce","dcf","dcg","dch","dci","dcj","dck","dcl","dcm","dcn","dda","ddb","ddc","ddd","dde","ddf","ddg","ddh","ddi","ddj","ddk","ddl","ddm","ddn","dea","deb","dec","ded","dee","def","deg","deh","dei","dej","dek","del","dem","den","dfa","dfb","dfc","dfd","dfe","dff","dfg","dfh","dfi","dfj","dfk","dfl","dfm","dfn","dga","dgb","dgc","dgd","dge","dgf","dgg","dgh","dgi","dgj","dgk","dgl","dgm","dgn","dha","dhb","dhc","dhd","dhe","dhf","dhg","dhh","dhi","dhj","dhk","dhl","dhm","dhn","dia","dib","dic","did","die","dif","dig","dih","dii","dij","dik","dil","dim","din","dja","djb","djc","djd","dje","djf","djg","djh","dji","djj","djk","djl","djm","djn","dka","dkb","dkc","dkd","dke","dkf","dkg","dkh","dki","dkj","dkk","dkl","dkm","dkn","dla","dlb","dlc","dld","dle","dlf","dlg","dlh","dli","dlj","dlk","dll","dlm","dln","dma","dmb","dmc","dmd","dme","dmf","dmg","dmh","dmi","dmj","dmk","dml","dmm","dmn","dna","dnb","dnc","dnd","dne","dnf","dng","dnh","dni","dnj","dnk","dnl","dnm","dnn","eaa","eab","eac","ead","eae","eaf","eag","eah","eai","eaj","eak","eal","eam","ean","eba","ebb","ebc","ebd","ebe","ebf","ebg","ebh","ebi","ebj","ebk","ebl","ebm","ebn","eca","ecb","ecc","ecd","ece","ecf","ecg","ech","eci","ecj","eck","ecl","ecm","ecn","eda","edb","edc","edd","ede","edf","edg","edh","edi","edj","edk","edl","edm","edn","eea","eeb","eec","eed","eee","eef","eeg","eeh","eei","eej","eek","eel","eem","een","efa","efb","efc","efd","efe","eff","efg","efh","efi","efj","efk","efl","efm","efn","ega","egb","egc","egd","ege","egf","egg","egh","egi","egj","egk","egl","egm","egn","eha","ehb","ehc","ehd","ehe","ehf","ehg","ehh","ehi","ehj","ehk","ehl","ehm","ehn","eia","eib","eic","eid","eie","eif","eig","eih","eii","eij","eik","eil","eim","ein","eja","ejb","ejc","ejd","eje","ejf","ejg","ejh","eji","ejj","ejk","ejl","ejm","ejn","eka","ekb","ekc","ekd","eke","ekf","ekg","ekh","eki","ekj","ekk","ekl","ekm","ekn","ela","elb","elc","eld","ele","elf","elg","elh","eli","elj","elk","ell","elm","eln","ema","emb","emc","emd","eme","emf","emg","emh","emi","emj","emk","eml","emm","emn","ena","enb","enc","end","ene","enf","eng","enh","eni","enj","enk","enl","enm","enn","faa","fab","fac","fad","fae","faf","fag","fah","fai","faj","fak","fal","fam","fan","fba","fbb","fbc","fbd","fbe","fbf","fbg","fbh","fbi","fbj","fbk","fbl","fbm","fbn","fca","fcb","fcc","fcd","fce","fcf","fcg","fch","fci","fcj","fck","fcl","fcm","fcn","fda","fdb","fdc","fdd","fde","fdf","fdg","fdh","fdi","fdj","fdk","fdl","fdm","fdn","fea","feb","fec","fed","fee","fef","feg","feh","fei","fej","fek","fel","fem","fen","ffa","ffb","ffc","ffd","ffe","fff","ffg","ffh","ffi","ffj","ffk","ffl","ffm","ffn","fga","fgb","fgc","fgd","fge","fgf","fgg","fgh","fgi","fgj","fgk","fgl","fgm","fgn","fha","fhb","fhc","fhd","fhe","fhf","fhg","fhh","fhi","fhj","fhk","fhl","fhm","fhn","fia","fib","fic","fid","fie","fif","fig","fih","fii","fij","fik","fil","fim","fin","fja","fjb","fjc","fjd","fje","fjf","fjg","fjh","fji","fjj","fjk","fjl","fjm","fjn","fka","fkb","fkc","fkd","fke","fkf","fkg","fkh","fki","fkj","fkk","fkl","fkm","fkn","fla","flb","flc","fld","fle","flf","flg","flh","fli","flj","flk","fll","flm","fln","fma","fmb","fmc","fmd","fme","fmf","fmg","fmh","fmi","fmj","fmk","fml","fmm","fmn","fna","fnb","fnc","fnd","fne","fnf","fng","fnh","fni","fnj","fnk","fnl","fnm","fnn","gaa","gab","gac","gad","gae","gaf","gag","gah","gai","gaj","gak","gal","gam","gan","gba","gbb","gbc","gbd","gbe","gbf","gbg","gbh","gbi","gbj","gbk","gbl","gbm","gbn","gca","gcb","gcc","gcd","gce","gcf","gcg","gch","gci","gcj","gck","gcl","gcm","gcn","gda","gdb","gdc","gdd","gde","gdf","gdg","gdh","gdi","gdj","gdk","gdl","gdm","gdn","gea","geb","gec","ged","gee","gef","geg","geh","gei","gej","gek","gel","gem","gen","gfa","gfb","gfc","gfd","gfe","gff","gfg","gfh","gfi","gfj","gfk","gfl","gfm","gfn","gga","ggb","ggc","ggd","gge","ggf","ggg","ggh","ggi","ggj","ggk","ggl","ggm","ggn","gha","ghb","ghc","ghd","ghe","ghf","ghg","ghh","ghi","ghj","ghk","ghl","ghm","ghn","gia","gib","gic","gid","gie","gif","gig","gih","gii","gij","gik","gil","gim","gin","gja","gjb","gjc","gjd","gje","gjf","gjg","gjh","gji","gjj","gjk","gjl","gjm","gjn","gka","gkb","gkc","gkd","gke","gkf","gkg","gkh","gki","gkj","gkk","gkl","gkm","gkn","gla","glb","glc","gld","gle","glf","glg","glh","gli","glj","glk","gll","glm","gln","gma","gmb","gmc","gmd","gme","gmf","gmg","gmh","gmi","gmj","gmk","gml","gmm","gmn","gna","gnb","gnc","gnd","gne","gnf","gng","gnh","gni","gnj","gnk","gnl","gnm","gnn","haa","hab","hac","had","hae","haf","hag","hah","hai","haj","hak","hal","ham","han","hba","hbb","hbc","hbd","hbe","hbf","hbg","hbh","hbi","hbj","hbk","hbl","hbm","hbn","hca","hcb","hcc","hcd","hce","hcf","hcg","hch","hci","hcj","hck","hcl","hcm","hcn","hda","hdb","hdc","hdd","hde","hdf","hdg","hdh","hdi","hdj","hdk","hdl","hdm","hdn","hea","heb","hec","hed","hee","hef","heg","heh","hei","hej","hek","hel","hem","hen","hfa","hfb","hfc","hfd","hfe","hff","hfg","hfh","hfi","hfj","hfk","hfl","hfm","hfn","hga","hgb","hgc","hgd","hge","hgf","hgg","hgh","hgi","hgj","hgk","hgl","hgm","hgn","hha","hhb","hhc","hhd","hhe","hhf","hhg","hhh","hhi","hhj","hhk","hhl","hhm","hhn","hia","hib","hic","hid","hie","hif","hig","hih","hii","hij","hik","hil","him","hin","hja","hjb","hjc","hjd","hje","hjf","hjg","hjh","hji","hjj","hjk","hjl","hjm","hjn","hka","hkb","hkc","hkd","hke","hkf","hkg","hkh","hki","hkj","hkk","hkl","hkm","hkn","hla","hlb","hlc","hld","hle","hlf","hlg","hlh","hli","hlj","hlk","hll","hlm","hln","hma","hmb","hmc","hmd","hme","hmf","hmg","hmh","hmi","hmj","hmk","hml","hmm","hmn","hna","hnb","hnc","hnd","hne","hnf","hng","hnh","hni","hnj","hnk","hnl","hnm","hnn","iaa","iab","iac","iad","iae","iaf","iag","iah","iai","iaj","iak","ial","iam","ian","iba","ibb","ibc","ibd","ibe","ibf","ibg","ibh","ibi","ibj","ibk","ibl","ibm","ibn","ica","icb","icc","icd","ice","icf","icg","ich","ici","icj","ick","icl","icm","icn","ida","idb","idc","idd","ide","idf","idg","idh","idi","idj","idk","idl","idm","idn","iea","ieb","iec","ied","iee","ief","ieg","ieh","iei","iej","iek","iel","iem","ien","ifa","ifb","ifc","ifd","ife","iff","ifg","ifh","ifi","ifj","ifk","ifl","ifm","ifn","iga","igb","igc","igd","ige","igf","igg","igh","igi","igj","igk","igl","igm","ign","iha","ihb","ihc","ihd","ihe","ihf","ihg","ihh","ihi","ihj","ihk","ihl","ihm","ihn","iia","iib","iic","iid","iie","iif","iig","iih","iii","iij","iik","iil","iim","iin","ija","ijb","ijc","ijd","ije","ijf","ijg","ijh","iji","ijj","ijk","ijl","ijm","ijn","ika","ikb","ikc","ikd","ike","ikf","ikg","ikh","iki","ikj","ikk","ikl","ikm","ikn","ila","ilb","ilc","ild","ile","ilf","ilg","ilh","ili","ilj","ilk","ill","ilm","iln","ima","imb","imc","imd","ime","imf","img","imh","imi","imj","imk","iml","imm","imn","ina","inb","inc","ind","ine","inf","ing","inh","ini","inj","ink","inl","inm","inn","jaa","jab","jac","jad","jae","jaf","jag","jah","jai","jaj","jak","jal","jam","jan","jba","jbb","jbc","jbd","jbe","jbf","jbg","jbh","jbi","jbj","jbk","jbl","jbm","jbn","jca","jcb","jcc","jcd","jce","jcf","jcg","jch","jci","jcj","jck","jcl","jcm","jcn","jda","jdb","jdc","jdd","jde","jdf","jdg","jdh","jdi","jdj","jdk","jdl","jdm","jdn","jea","jeb","jec","jed","jee","jef","jeg","jeh","jei","jej","jek","jel","jem","jen","jfa","jfb","jfc","jfd","jfe","jff","jfg","jfh","jfi","jfj","jfk","jfl","jfm","jfn","jga","jgb","jgc","jgd","jge","jgf","jgg","jgh","jgi","jgj","jgk","jgl","jgm","jgn","jha","jhb","jhc","jhd","jhe","jhf","jhg","jhh","jhi","jhj","jhk","jhl","jhm","jhn","jia","jib","jic","jid","jie","jif","jig","jih","jii","jij","jik","jil","jim","jin","jja","jjb","jjc","jjd","jje","jjf","jjg","jjh","jji","jjj","jjk","jjl","jjm","jjn","jka","jkb","jkc","jkd","jke","jkf","jkg","jkh","jki","jkj","jkk","jkl","jkm","jkn","jla","jlb","jlc","jld","jle","jlf","jlg","jlh","jli","jlj","jlk","jll","jlm","jln","jma","jmb","jmc","jmd","jme","jmf","jmg","jmh","jmi","jmj","jmk","jml","jmm","jmn","jna","jnb","jnc","jnd","jne","jnf","jng","jnh","jni","jnj","jnk","jnl","jnm","jnn","kaa","kab","kac","kad","kae","kaf","kag","kah","kai","kaj","kak","kal","kam","kan","kba","kbb","kbc","kbd","kbe","kbf","kbg","kbh","kbi","kbj","kbk","kbl","kbm","kbn","kca","kcb","kcc","kcd","kce","kcf","kcg","kch","kci","kcj","kck","kcl","kcm","kcn","kda","kdb","kdc","kdd","kde","kdf","kdg","kdh","kdi","kdj","kdk","kdl","kdm","kdn","kea","keb","kec","ked","kee","kef","keg","keh","kei","kej","kek","kel","kem","ken","kfa","kfb","kfc","kfd","kfe","kff","kfg","kfh","kfi","kfj","kfk","kfl","kfm","kfn","kga","kgb","kgc","kgd","kge","kgf","kgg","kgh","kgi","kgj","kgk","kgl","kgm","kgn","kha","khb","khc","khd","khe","khf","khg","khh","khi","khj","khk","khl","khm","khn","kia","kib","kic","kid","kie","kif","kig","kih","kii","kij","kik","kil","kim","kin","kja","kjb","kjc","kjd","kje","kjf","kjg","kjh","kji","kjj","kjk","kjl","kjm","kjn","kka","kkb","kkc","kkd","kke","kkf","kkg","kkh","kki","kkj","kkk","kkl","kkm","kkn","kla","klb","klc","kld","kle","klf","klg","klh","kli","klj","klk","kll","klm","kln","kma","kmb","kmc","kmd","kme","kmf","kmg","kmh","kmi","kmj","kmk","kml","kmm","kmn","kna","knb","knc","knd","kne","knf","kng","knh","kni","knj","knk","knl","knm","knn","laa","lab","lac","lad","lae","laf","lag","lah","lai","laj","lak","lal","lam","lan","lba","lbb","lbc","lbd","lbe","lbf","lbg","lbh","lbi","lbj","lbk","lbl","lbm","lbn","lca","lcb","lcc","lcd","lce","lcf","lcg","lch","lci","lcj","lck","lcl","lcm","lcn","lda","ldb","ldc","ldd","lde","ldf","ldg","ldh","ldi","ldj","ldk","ldl","ldm","ldn","lea","leb","lec","led","lee","lef","leg","leh","lei","lej","lek","lel","lem","len","lfa","lfb","lfc","lfd","lfe","lff","lfg","lfh","lfi","lfj","lfk","lfl","lfm","lfn","lga","lgb","lgc","lgd","lge","lgf","lgg","lgh","lgi","lgj","lgk","lgl","lgm","lgn","lha","lhb","lhc","lhd","lhe","lhf","lhg","lhh","lhi","lhj","lhk","lhl","lhm","lhn","lia","lib","lic","lid","lie","lif","lig","lih","lii","lij","lik","lil","lim","lin","lja","ljb","ljc","ljd","lje","ljf","ljg","ljh","lji","ljj","ljk","ljl","ljm","ljn","lka","lkb","lkc","lkd","lke","lkf","lkg","lkh","lki","lkj","lkk","lkl","lkm","lkn","lla","llb","llc","lld","lle","llf","llg","llh","lli","llj","llk","lll","llm","lln","lma","lmb","lmc","lmd","lme","lmf","lmg","lmh","lmi","lmj","lmk","lml","lmm","lmn","lna","lnb","lnc","lnd","lne","lnf","lng","lnh","lni","lnj","lnk","lnl","lnm","lnn","maa","mab","mac","mad","mae","maf","mag","mah","mai","maj","mak","mal","mam","man","mba","mbb","mbc","mbd","mbe","mbf","mbg","mbh","mbi","mbj","mbk","mbl","mbm","mbn","mca","mcb","mcc","mcd","mce","mcf","mcg","mch","mci","mcj","mck","mcl","mcm","mcn","mda","mdb","mdc","mdd","mde","mdf","mdg","mdh","mdi","mdj","mdk","mdl","mdm","mdn","mea","meb","mec","med","mee","mef","meg","meh","mei","mej","mek","mel","mem","men","mfa","mfb","mfc","mfd","mfe","mff","mfg","mfh","mfi","mfj","mfk","mfl","mfm","mfn","mga","mgb","mgc","mgd","mge","mgf","mgg","mgh","mgi","mgj","mgk","mgl","mgm","mgn","mha","mhb","mhc","mhd","mhe","mhf","mhg","mhh","mhi","mhj","mhk","mhl","mhm","mhn","mia","mib","mic","mid","mie","mif","mig","mih","mii","mij","mik","mil","mim","min","mja","mjb","mjc","mjd","mje","mjf","mjg","mjh","mji","mjj","mjk","mjl","mjm","mjn","mka","mkb","mkc","mkd","mke","mkf","mkg","mkh","mki","mkj","mkk","mkl","mkm","mkn","mla","mlb","mlc","mld","mle","mlf","mlg","mlh","mli","mlj","mlk","mll","mlm","mln","mma","mmb","mmc","mmd","mme","mmf","mmg","mmh","mmi","mmj","mmk","mml","mmm","mmn","mna","mnb","mnc","mnd","mne","mnf","mng","mnh","mni","mnj","mnk","mnl","mnm","mnn","naa","nab","nac","nad","nae","naf","nag","nah","nai","naj","nak","nal","nam","nan","nba","nbb","nbc","nbd","nbe","nbf","nbg","nbh","nbi","nbj","nbk","nbl","nbm","nbn","nca","ncb","ncc","ncd","nce","ncf","ncg","nch","nci","ncj","nck","ncl","ncm","ncn","nda","ndb","ndc","ndd","nde","ndf","ndg","ndh","ndi","ndj","ndk","ndl","ndm","ndn","nea","neb","nec","ned","nee","nef","neg","neh","nei","nej","nek","nel","nem","nen","nfa","nfb","nfc","nfd","nfe","nff","nfg","nfh","nfi","nfj","nfk","nfl","nfm","nfn","nga","ngb","ngc","ngd","nge","ngf","ngg","ngh","ngi","ngj","ngk","ngl","ngm","ngn","nha","nhb","nhc","nhd","nhe","nhf","nhg","nhh","nhi","nhj","nhk","nhl","nhm","nhn","nia","nib","nic","nid","nie","nif","nig","nih","nii","nij","nik","nil","nim","nin","nja","njb","njc","njd","nje","njf","njg","njh","nji","njj","njk","njl","njm","njn","nka","nkb","nkc","nkd","nke","nkf","nkg","nkh","nki","nkj","nkk","nkl","nkm","nkn","nla","nlb","nlc","nld","nle","nlf","nlg","nlh","nli","nlj","nlk","nll","nlm","nln","nma","nmb","nmc","nmd","nme","nmf","nmg","nmh","nmi","nmj","nmk","nml","nmm","nmn","nna","nnb","nnc","nnd","nne","nnf","nng","nnh","nni","nnj","nnk","nnl","nnm","nnn"};
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                FindReplaceNames frame = new FindReplaceNames();

                nameField.setPreferredSize(new Dimension(200, 25));
                nameField.setSelectionStart(0);
                nameField.setSelectionEnd(nameField.getText().length());
                
                JPanel inputPanel = new JPanel();
                inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
                inputPanel.setPreferredSize(new Dimension(200, 200));
                inputPanel.add(input);
                
                JPanel outputPanel = new JPanel();
                outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.Y_AXIS));
                outputPanel.setPreferredSize(new Dimension(200, 200));
                outputPanel.add(output);
                
                JButton process = new JButton("Process!");
                process.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        process();
                    }
                });
                
                frame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
                frame.add(nameField);
                frame.add(inputPanel);
                frame.add(outputPanel);
                frame.add(process);
                frame.setSize(230, 515);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
    
    public static void process() {
        HashMap<String, String> map = new HashMap<>();
        
        //Remove quotes
        String inputText = input.getText();
        inputText = inputText.replace("\"", "");
        
        int counter = 0;
        for (String entry : inputText.split("\n")) {
            String[] array = entry.split(",");
            
            //Assign unique pair to name key, left of comma
            String annon = annonArray[counter];
            if (map.putIfAbsent(array[0],annon) == null) {
                counter++;
            }
            
            //Assign unique pair to name key, right of comma
            if (map.putIfAbsent(array[1],annon) == null) {
                counter++;
            }
        }
        
        System.out.println(map.toString());
        System.out.println(map.size());
        
        //Replace names with annoymous values given from hashmap and annon array
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            inputText = inputText.replace((String) pair.getKey(), (String) pair.getValue());
        }
        
        //Replace your annoymous name with name given in name JTextField
        String name = nameField.getText();
        String annonName = map.get("Gary Read");
        
        System.out.println(name + " - " + annonName);
        
        inputText = inputText.replace(annonName, name);
        
        output.setText(inputText);
    }
}
